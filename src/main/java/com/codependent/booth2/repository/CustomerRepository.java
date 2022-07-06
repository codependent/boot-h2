package com.codependent.booth2.repository;

import com.codependent.booth2.entity.CustomerEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<CustomerEntity, Integer> {
}
