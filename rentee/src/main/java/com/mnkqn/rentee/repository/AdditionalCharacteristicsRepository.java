package com.mnkqn.rentee.repository;

import com.mnkqn.rentee.domain.entity.AdditionalCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalCharacteristicsRepository extends JpaRepository<AdditionalCharacteristics, Long> {
}
