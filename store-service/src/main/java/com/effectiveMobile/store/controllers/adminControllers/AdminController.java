package com.effectiveMobile.store.controllers.adminControllers;

import com.effectiveMobile.store.entities.Notification;
import com.effectiveMobile.store.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @PutMapping("/products/{id}}")
    public ResponseEntity<?> changeInformationAboutProduct(@PathVariable long id) {

    }

    @PostMapping("/products/{id}}")
    public ResponseEntity<?> addInformationAboutProduct(@PathVariable long id) {

    }

    @PutMapping("/products/{id}}")
    public ResponseEntity<?> changeInformationAboutProductDiscount(@PathVariable long id) {

    }

    @PostMapping("/products/{id}}")
    public ResponseEntity<?> addInformationAboutProductDiscount(@PathVariable long id) {

    }

    @PutMapping("/products")
    public ResponseEntity<?> changeInformationAboutProductDiscountForBunchProduct(@PathVariable long id) {

    }

    @PostMapping("/products")
    public ResponseEntity<?> addInformationAboutProductDiscountForBunchProduct(@PathVariable long id) {

    }

    @GetMapping("/users/{userId}/products")
    public ResponseEntity<?> getHistoryOfUser(@PathVariable long userId) {

    }

    @PutMapping("/users/{userId}/balance")
    public ResponseEntity<?> topUPUserBalance(@PathVariable long userId) {

    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<?> getUserInformation(@RequestBody User user, @PathVariable long userId) {

    }

    @PutMapping("/users/accounts/{userId}")
    public ResponseEntity<?> changeStatusOfUserAccount(@RequestParam(value = "status", required = true,
            defaultValue = "ACTIVE") String status, @PathVariable String userId) {

    }

    @PostMapping("/users/{userId}")
    public ResponseEntity<?> sendNotificationToUser(@RequestBody Notification notification,
                                                    @PathVariable String userId) {

    }
}
