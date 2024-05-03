package com.ltp.contacts.service;

import com.ltp.contacts.pojo.Contact;

public interface ContactService {

  Contact getContactById(String id);
  void saveContact(Contact contact);
  void updateContact(String id, Contact contact);
}
