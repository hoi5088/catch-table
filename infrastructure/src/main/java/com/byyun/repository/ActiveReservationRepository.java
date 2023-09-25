package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.ActiveReservation;

@Repository
public interface ActiveReservationRepository extends JpaRepository<ActiveReservation, Long> {
}
