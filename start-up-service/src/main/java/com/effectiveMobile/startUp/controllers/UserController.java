package com.effectiveMobile.startUp.controllers;

import com.effectiveMobile.startUp.entities.Company;
import com.effectiveMobile.startUp.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class UserController {

    @PostMapping("/registrations/users/{userId}")
    public ResponseEntity<?> addClaimToRegistrationOfCompany(@RequestBody Company company, @PathVariable long userId) {

    }

    @PostMapping("/products/{productId}/users/{userId}")
    public ResponseEntity<?> addProduct(@RequestBody Product product,
                                         @PathVariable long productId, @PathVariable long userId) {

    }

    @PostMapping("/products/{productId}/users/{userId}")
    public ResponseEntity<?> sellProduct(@PathVariable long productId, @PathVariable long userId) {

    }
}
