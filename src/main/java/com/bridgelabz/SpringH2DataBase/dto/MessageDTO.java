package com.bridgelabz.SpringH2DataBase.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class MessageDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z]{2,}$",message = "Title pattern Not Matching")
    @NotEmpty(message = "Title Pattern is not matching")
    public String title;
    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z]{2,}$",message = "Author pattern Mismatch")
    @NotEmpty(message = "Title Pattern is not matching")
    public String author;
    public LocalDate StartDate;
    public LocalDate endDate;

}
