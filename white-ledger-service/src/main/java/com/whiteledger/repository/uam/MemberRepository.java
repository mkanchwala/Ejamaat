package com.whiteledger.repository.uam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whiteledger.domain.uam.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
