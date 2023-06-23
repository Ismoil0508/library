package org.example.dto;

import org.example.enums.ProfileRoles;
import org.example.enums.ProfileStatus;

import java.time.LocalDateTime;

public class Profile {
    private Integer id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String phone;
    private ProfileStatus status;
    private ProfileRoles role;
    private LocalDateTime createdDate;
}

