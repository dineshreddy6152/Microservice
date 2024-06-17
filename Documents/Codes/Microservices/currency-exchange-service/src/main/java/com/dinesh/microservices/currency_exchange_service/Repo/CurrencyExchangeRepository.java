package com.dinesh.microservices.currency_exchange_service.Repo;

import com.dinesh.microservices.currency_exchange_service.Entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);

}
