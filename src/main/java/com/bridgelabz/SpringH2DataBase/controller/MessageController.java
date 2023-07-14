package com.bridgelabz.SpringH2DataBase.controller;

import com.bridgelabz.SpringH2DataBase.dto.MessageDTO;
import com.bridgelabz.SpringH2DataBase.dto.ResponceDTO;
import com.bridgelabz.SpringH2DataBase.model.Message;
import com.bridgelabz.SpringH2DataBase.repository.MessageRepo;
import com.bridgelabz.SpringH2DataBase.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageRepo messageRepo;
    @Autowired
    private MessageService messageService;

    @PostMapping ("/add")
    public ResponseEntity<ResponceDTO> addMessage(@RequestBody MessageDTO messageDTO){
        ResponceDTO responceDTO=new ResponceDTO("Data added successfully",messageService.addMessage(messageDTO));
        return new ResponseEntity<>(responceDTO,HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();

    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<ResponceDTO> getById(@PathVariable long id){
        ResponceDTO responceDTO=new ResponceDTO("Data Fetch successfully",messageService.getById(id));
        return new ResponseEntity<>(responceDTO,HttpStatus.OK);
    }




}
