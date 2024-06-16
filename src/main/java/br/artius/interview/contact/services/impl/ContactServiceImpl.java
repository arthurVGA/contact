package br.artius.interview.contact.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.artius.interview.contact.models.Contact;
import br.artius.interview.contact.repositories.ContactRepository;
import br.artius.interview.contact.services.ContactService;

public class ContactServiceImpl implements ContactService {

    @Autowired
    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void create(Contact contact) {
        this.contactRepository.save(contact);
    }

    @Override
    public void update(Contact contact) {
        this.contactRepository.save(contact);
    }

    @Override
    public Optional<Contact> findByCpf(String cpf) {
        return this.contactRepository.findByCpf(cpf);
    }

    @Override
    public List<Contact> findAll() {
        return this.contactRepository.findAll();
    }

    @Override
    public void delete(String cpf) {
        this.contactRepository.delete(cpf);
    }

}
