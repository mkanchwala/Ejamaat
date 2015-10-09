package com.mkanchwala.ejamaat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkanchwala.ejamaat.domain.Sabeel;

@Repository
public interface SabeelRepository extends JpaRepository<Sabeel, Long> {

}
