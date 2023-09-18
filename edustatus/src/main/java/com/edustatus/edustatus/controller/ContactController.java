package com.edustatus.edustatus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edustatus.edustatus.Service.ContactService;
import com.edustatus.edustatus.model.Contact;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class ContactController {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    
    @RequestMapping("/contact")
    public String displayContactPage(){
        return "contact.html";
    }

@RequestMapping(value = "/saveMsg", method = POST)
public ModelAndView saveMessage(Contact contact){
    contactService.saveMessage(contact);
    return new ModelAndView("redirect:/contact");
}
}
