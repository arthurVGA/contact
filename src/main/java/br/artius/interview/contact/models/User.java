package br.artius.interview.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private String username;
    private String name;
    private String email;
}
