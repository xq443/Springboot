package com.ltp.contacts.web;

import com.ltp.contacts.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.ltp.contacts.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/{id}")
    //@PathVariable is an annotation used in Spring MVC framework to extract values from
    // the URI template (the part of the URL that comes after the base URL)
    // and use them as method parameters in your Spring MVC controller methods.
    public ResponseEntity<Contact> getContact(@PathVariable String id) {
        Contact contact = contactService.getContactById(id);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}
