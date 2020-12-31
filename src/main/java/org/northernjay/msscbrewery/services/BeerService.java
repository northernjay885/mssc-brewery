package org.northernjay.msscbrewery.services;

import org.northernjay.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
