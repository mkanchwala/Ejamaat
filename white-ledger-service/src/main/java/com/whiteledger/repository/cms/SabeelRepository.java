package com.whiteledger.repository.cms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whiteledger.domain.cms.Business;

@Repository
public interface SabeelRepository extends JpaRepository<Business, Long> {

}
