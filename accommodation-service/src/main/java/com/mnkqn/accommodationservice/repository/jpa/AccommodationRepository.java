package com.mnkqn.accommodationservice.repository.jpa;

import com.mnkqn.accommodationservice.model.entity.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    Accommodation getById(Long id);

    List<Accommodation> findAllByOwnerId(String id);
}
