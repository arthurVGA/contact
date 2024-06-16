package br.artius.interview.contact.controllers.impl;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.artius.interview.contact.controllers.ContactController;
import br.artius.interview.contact.models.Contact;
import br.artius.interview.contact.services.ContactService;

public class ContactControllerImpl implements ContactController {

    @Autowired
    private final ContactService contactService;

    public ContactControllerImpl(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    public ResponseEntity<URI> create(Contact contact) {
        this.contactService.create(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(URI.create("/contacts/" + contact.getCpf()));
    }

    @Override
    public ResponseEntity<URI> update(Contact contact) {
        this.contactService.update(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(URI.create("/contacts/" + contact.getCpf()));
    }

    @Override
    public ResponseEntity<Optional<Contact>> findByCpf(String cpf) {
        final Optional<Contact> contact = this.contactService.findByCpf(cpf);
        return ResponseEntity.ok(contact);
    }

    @Override
    public ResponseEntity<List<Contact>> findAll() {
        final List<Contact> contacts = this.contactService.findAll();
        return ResponseEntity.ok(contacts);
    }

}
