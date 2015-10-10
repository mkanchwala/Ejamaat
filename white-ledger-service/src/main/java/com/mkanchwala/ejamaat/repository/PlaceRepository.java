package com.mkanchwala.ejamaat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkanchwala.ejamaat.domain.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

}
