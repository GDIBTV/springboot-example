package com.dealer.example;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * User: ddcrichak
 * Date: 9/22/14
 */
@RepositoryRestResource
public interface AttributeRepository extends PagingAndSortingRepository<Attribute, String> {
}
