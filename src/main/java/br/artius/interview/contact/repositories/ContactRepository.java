package br.artius.interview.contact.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.artius.interview.contact.models.Contact;

@Repository
public interface ContactRepository {

    void save(Contact contact);

    Optional<Contact> findByCpf(String cpf);

    List<Contact> findAll();

    void delete(String cpf);
}
