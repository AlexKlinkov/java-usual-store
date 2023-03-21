package com.effectiveMobile.store.controllers.userControllers;

import com.effectiveMobile.store.entities.Notification;
import com.effectiveMobile.store.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/products/{id}}")
    public ResponseEntity<?> buyProduct(@RequestBody Product product, @PathVariable long id) {

    }

    @PostMapping("/products/obtained/{id}}")
    public ResponseEntity<?> addCommentToProduct(@PathVariable long id) {

    }

    @PostMapping("/products/obtained/{id}}")
    public ResponseEntity<?> addUserGradeOfProduct(@PathVariable long id) {

    }

    @GetMapping("/products/obtained")
    public ResponseEntity<?> getHistoryOfObtainedProducts() {

    }

    @PostMapping("/products/obtained/return")
    public ResponseEntity<?> returnProduct() {

    }

    @GetMapping("/notification/{userId}")
    public ResponseEntity<?> getUserNotification(@RequestBody Notification notification, @PathVariable long userId) {

    }
}
