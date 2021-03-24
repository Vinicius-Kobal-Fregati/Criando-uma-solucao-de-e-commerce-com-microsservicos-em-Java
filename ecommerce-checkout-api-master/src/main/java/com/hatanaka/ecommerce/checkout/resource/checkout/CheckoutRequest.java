package com.hatanaka.ecommerce.checkout.resource.checkout;

import lombok.AllArgsConstructor;
import lombok.Data; // Com isso, só precisamos declarar as implementações.
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data //Cria Getter e Setter
@AllArgsConstructor // Isso cria um construtor no tempo de compilação para todos os argumentos.
@NoArgsConstructor
public class CheckoutRequest implements Serializable { // O serializable diz que essa classe precisa ser serializada.

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;
    private List<String> products;
}

