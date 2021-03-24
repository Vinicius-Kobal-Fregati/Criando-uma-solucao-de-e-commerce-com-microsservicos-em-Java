package com.hatanaka.ecommerce.checkout.repository;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> { // Essa interface extende o JpaRepository, também passamos a entidade e o tipo do indicador, nesse caso, o id.

    Optional<CheckoutEntity> findByCode(String code);
}
