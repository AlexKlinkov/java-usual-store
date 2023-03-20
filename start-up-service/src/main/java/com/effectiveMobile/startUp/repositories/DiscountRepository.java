package com.effectiveMobile.startUp.repositories;

import com.effectiveMobile.startUp.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

}

