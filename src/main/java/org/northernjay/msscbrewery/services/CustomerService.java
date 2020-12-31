package org.northernjay.msscbrewery.services;

import org.northernjay.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
