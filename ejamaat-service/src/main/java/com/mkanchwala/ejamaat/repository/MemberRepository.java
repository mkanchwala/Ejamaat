package com.mkanchwala.ejamaat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkanchwala.ejamaat.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
