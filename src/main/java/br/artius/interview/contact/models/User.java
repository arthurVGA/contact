package br.artius.interview.contact.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private String email;
    private List<Contact> contacts;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.contacts = new ArrayList<>();
    }
}
