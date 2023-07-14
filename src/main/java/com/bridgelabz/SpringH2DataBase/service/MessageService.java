package com.bridgelabz.SpringH2DataBase.service;

import com.bridgelabz.SpringH2DataBase.dto.MessageDTO;
import com.bridgelabz.SpringH2DataBase.model.Message;
import com.bridgelabz.SpringH2DataBase.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;


    public Message addMessage(MessageDTO messageDTO) {
        Message messageData=new Message(messageDTO);
        return messageRepo.save(messageData);

    }
    public List<Message> getAllMessages() {
        return messageRepo.findAll();
    }
    public Optional<Message> getById(long id){
        return messageRepo.findById(id);
    }
}
