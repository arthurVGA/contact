package br.artius.interview.contact.repositories.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.artius.interview.contact.models.Contact;
import br.artius.interview.contact.repositories.ContactRepository;

public class ContactRepositoryImpl implements ContactRepository {

    private final List<Contact> base;

    public ContactRepositoryImpl() {
        this.base = new ArrayList<>();
    }

    @Override
    public void save(Contact contact) {
        if (!this.base.contains(contact)) {
            create(contact);
        } else {
            update(contact);
        }
    }

    private void create(Contact contact) {
        this.base.add(contact);
    }

    private void update(Contact contact) {
        this.base.stream().peek((Contact tempContact) -> {
            tempContact = contact;
        });
    }

    @Override
    public Optional<Contact> findByCpf(String cpf) {
        return this.base.stream().filter((Contact contact) -> contact.getCpf().equals(cpf)).findFirst();
    }

    @Override
    public List<Contact> findAll() {
        return this.base;
    }

    @Override
    public void delete(String cpf) {
        this.base.forEach((contact) -> {
            if (contact.getCpf().equals(cpf)) {
                this.delete(contact);
            }
        });
    }

    public void delete(Contact contact) {
        this.base.remove(contact);
    }

}
