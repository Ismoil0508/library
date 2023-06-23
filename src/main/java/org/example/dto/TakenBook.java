package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;
public class TakenBook {

    private Integer id;

    private Integer studentId;
    private Integer bookId;
    private LocalDateTime createdDate;
    private Status status;
    private String note;
}
