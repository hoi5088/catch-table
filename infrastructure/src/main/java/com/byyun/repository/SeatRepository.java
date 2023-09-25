package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.Seat;

@Repository
public interface SeatRepository  extends JpaRepository<Seat, Long> {
}
