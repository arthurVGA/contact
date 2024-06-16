package br.artius.interview.contact.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.artius.interview.contact.models.Contact;

@RestController
@RequestMapping("/contacts")
public interface ContactController {

    @PostMapping
    ResponseEntity<URI> create(@RequestBody Contact contact);

    @PutMapping
    ResponseEntity<URI> update(@RequestBody Contact contact);

    @GetMapping("/{cpf}")
    ResponseEntity<Optional<Contact>> findByCpf(@PathVariable String cpf);

    @GetMapping
    ResponseEntity<List<Contact>> findAll();

}
