package br.artius.interview.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Contact {

    private String name;
    private String cpf;
    private String phone;
    private String address;
    private String cep;
    private String latitude;
    private String longitude;

}
