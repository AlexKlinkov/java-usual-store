package com.effectiveMobile.store.controllers.adminControllers;

import com.effectiveMobile.store.entities.Notification;
import com.effectiveMobile.store.entities.Product;
import com.effectiveMobile.store.entities.User;
import com.effectiveMobile.store.services.adminServices.AdminService;
import com.effectiveMobile.store.services.userServices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;
    private final UserService

    @Autowired
    public AdminController(@Qualifier("AdminServiceImpl") AdminService adminService) {
        this.adminService = adminService;
    }

    @PutMapping("/products/{id}}")
    public ResponseEntity<?> changeInformationAboutProductById(@RequestBody Product product, @PathVariable long id) {
        return adminService.changeInformationAboutProductById(product, id);
    }

    @PostMapping("/products/{id}}")
    public ResponseEntity<?> addInformationAboutProductById(@RequestBody Product product, @PathVariable long id) {
        return adminService.addInformationAboutProductById(product, id);
    }

    @PutMapping("/products/{id}}")
    public ResponseEntity<?> changeInformationAboutProductDiscountById(@RequestBody Product product,
                                                                       @PathVariable long id) {
        return adminService.changeInformationAboutProductDiscountById(product, id);
    }

    @PostMapping("/products/{id}}")
    public ResponseEntity<?> addInformationAboutProductDiscountById(@RequestBody Product product,
                                                                    @PathVariable long id) {
        return adminService.addInformationAboutProductDiscountById(product, id);
    }

    // TO DO define criteria which will be as base for determine size of discount on products
    @PutMapping("/products")
    public ResponseEntity<?> changeInformationAboutProductDiscountForBunchOfProducts(
            @RequestParam(value = "discountSize", defaultValue = "5") String discountSize,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "nameContains", required = false) String nameContainsThisWord,
            @RequestParam(value = "descriptionContains", required = false) String descriptionContainsThisWord,
            @RequestParam(value = "priceStart", required = false) String priceStart,
            @RequestParam(value = "priceFinish", required = false) String priceFinish,
            @RequestParam(value = "stockStart", required = false) String stockStart,
            @RequestParam(value = "stockFinish", required = false) String stockFinish,
            @RequestParam(value = "companyIds", required = false) List<Long> companyIds,
            @RequestParam(value = "reviews", required = false) String reviewsContainsThisWord,
            @RequestParam(value = "featureIds", required = false) List<Long> featureIds,
            @RequestParam(value = "featureName", required = false) String featureName,
            @RequestParam(value = "featureNameContains", required = false) String featureNameContains,
            @RequestParam(value = "featureValue", required = false) String featureValue,
            @RequestParam(value = "featureValueContains", required = false) String featureValueContains,....) {
        return adminService.changeInformationAboutProductDiscountForBunchOfProducts(discountSize, );
    }

    @PostMapping("/products")
    public ResponseEntity<?> addInformationAboutProductDiscountForBunchProducts(@RequestParam(value = "discountSize",
            defaultValue = "5") String discountSize) {
        return adminService.addInformationAboutProductDiscountForBunchProducts(discountSize);
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
