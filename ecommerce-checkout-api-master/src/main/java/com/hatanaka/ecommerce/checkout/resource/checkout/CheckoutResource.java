package com.hatanaka.ecommerce.checkout.resource.checkout;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import com.hatanaka.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Aqui mostra que é um controller, é utilizado para poder instanciar essa classe.
@RequestMapping("/v1/checkout") // Colocamos um path padrão para o nosso resource.
@RequiredArgsConstructor
public class CheckoutResource { // Temos nossa classe de resource.

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create(@RequestBody CheckoutRequest checkoutRequest) { // ResponseEntity é uma classe do spring que facilita a construção de api REST.
        final CheckoutEntity checkoutEntity = checkoutService.create(checkoutRequest).orElseThrow();
        final CheckoutResponse checkoutResponse = CheckoutResponse.builder()
                .code(checkoutEntity.getCode())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(checkoutResponse);
    }
}
