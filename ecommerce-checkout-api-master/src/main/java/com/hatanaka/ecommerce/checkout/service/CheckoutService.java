package com.hatanaka.ecommerce.checkout.service;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import com.hatanaka.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest); // No Java 8 tivemos a api optional, ela nos dá suporte para trabalharmos com coisas nulas (como objetos) ou quando não temos retorno do banco de dados.

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
