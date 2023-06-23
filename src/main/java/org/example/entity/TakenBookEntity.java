package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "taken_book")
public class TakenBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private ProfileEntity studentId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private BookEntity bookId;
    private LocalDateTime createdDate;
    private Status status;
    private String note;
}
