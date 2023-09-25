package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
