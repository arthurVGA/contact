package br.artius.interview.contact.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.artius.interview.contact.models.Contact;

@Service
public interface ContactService {

    void create(Contact contact);

    void update(Contact contact);

    Optional<Contact> findByCpf(String cpf);

    List<Contact> findAll();

    void delete(String cpf);
}
