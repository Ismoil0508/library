package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.ProfileRoles;
import org.example.enums.ProfileStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "status")
    private ProfileStatus status;
    @Column(name = "role")
    private ProfileRoles role;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
}
