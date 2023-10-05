package com.byyun.ri.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.ri.persistence.entity.Seat;

@Repository
public interface SeatRepository  extends JpaRepository<Seat, Long> {
}
