package com.effectiveMobile.startUp.repositories;

import com.effectiveMobile.startUp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCompanies_Name(String companyName);
}

