package org.northernjay.msscbrewery.services;

import org.northernjay.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .customerName("Alex")
                .build();
    }
}
