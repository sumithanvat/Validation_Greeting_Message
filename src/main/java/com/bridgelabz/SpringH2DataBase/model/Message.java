package com.bridgelabz.SpringH2DataBase.model;

import com.bridgelabz.SpringH2DataBase.dto.MessageDTO;
import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "Message_Data")
public class Message {

    public Message() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String author;
    private LocalDate startDate;
    private LocalDate endDate;


    public Message(MessageDTO messageDTO) {
        this.updateMessage(messageDTO);
    }
    public void updateMessage(MessageDTO messageDTO){
        this.title = messageDTO.title;
        this.author = messageDTO.author;
        this.endDate = messageDTO.endDate;
        this.startDate = messageDTO.StartDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}