package com.codependent.booth2;

import com.codependent.booth2.entity.CustomerEntity;
import com.codependent.booth2.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;
import reactor.test.StepVerifier;

import static org.springframework.test.context.TestConstructor.AutowireMode.ALL;

@SpringBootTest
@RequiredArgsConstructor
@TestConstructor(autowireMode = ALL)
class BootH2ApplicationTests {

    private final CustomerRepository customerRepository;

    @Test
    void shouldSaveAndLoadUsers() {

        customerRepository.save(new CustomerEntity(null, "Joe")).block();
        StepVerifier.create(customerRepository.findAll().collectList())
                .expectNextCount(1)
                .verifyComplete();
    }

}
