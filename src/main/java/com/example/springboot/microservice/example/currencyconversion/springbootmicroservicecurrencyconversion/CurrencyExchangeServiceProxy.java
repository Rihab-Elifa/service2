package com.example.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="forex-service" ,url="localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to);
}