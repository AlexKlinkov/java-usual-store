package com.effectiveMobile.store.repositories;

import com.effectiveMobile.store.entities.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
    List<Feature> findByProduct_Id(Long productId);
}

