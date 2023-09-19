package com.edulink.edulink.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.edulink.edulink.controller.ContactController;
import com.edulink.edulink.model.Contact;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);
    public boolean saveMessage(Contact contact){
        log.info(contact.toString());
        return false;
    }    
}
