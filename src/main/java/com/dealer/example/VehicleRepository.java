package com.dealer.example;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * User: ddcrichak
 * Date: 9/22/14
 */
@RepositoryRestResource
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, String>{
    @RestResource(path = "type", rel = "type")
    public Vehicle findByType(String type);
}
