package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.BusinessHour;

@Repository
public interface BusinessHourRepository extends JpaRepository<BusinessHour, Long> {
}
