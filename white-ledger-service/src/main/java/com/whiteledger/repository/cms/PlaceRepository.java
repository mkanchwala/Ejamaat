package com.whiteledger.repository.cms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whiteledger.domain.cms.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

}
