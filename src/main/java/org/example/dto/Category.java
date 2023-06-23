package org.example.dto;

import java.time.LocalDateTime;

public class Category {
    private Integer id;
    private String name; //(unique)
    private LocalDateTime createdDate;
    private Boolean visible;
}
