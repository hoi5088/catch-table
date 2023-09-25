package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
