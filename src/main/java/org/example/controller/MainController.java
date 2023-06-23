package org.example.controller;

import org.example.container.ComponentContainer;
import org.example.entity.BookEntity;
import org.example.entity.CategoryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Scanner;

public class MainController {


    /**** Main ***
     1. BookList  -> id, title, author, category
     2. Search ->
     Enter query:  (search by title or author or category)
     id, title, author, category
     3. By category:
     (print all category for choose) №,id,name
     Enter category:
     3. Login
     Enter Login:
     Enter Password:
     4. Registration
     Enter Name:
     Enter Surname:
     Enter Phone:
     Enter Login:
     Enter Password:
     0. Exit*/


    public void menu() {
        System.out.println(
                "1. BookList  -> id, title, author, category" +
                        "2. Search -> Enter query:  (search by title or author or category) id, title, author, category" +
                        "3. By category: (print all category for choose) №,id,name Enter category:" +
                        "4. Login" +
                        "Enter Login:" +
                        "Enter Password:" +
                        "5. Registration" +
                        "Enter Name:" +
                        "Enter Surname:" +
                        "Enter Phone:" +
                        "Enter Login:" +
                        "Enter Password:"
        );
    }

    public int action(){
        try{
            return ComponentContainer.intScanner.nextInt();
        }catch (RuntimeException e){
            return 0;
        }
    }


    public void run(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        BookEntity bookEntity = new BookEntity();
        session.save(bookEntity);
        t.commit();
        session.close();
        factory.close();

    }
}
