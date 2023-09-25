package com.byyun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byyun.entity.StoreBusinessInfo;

@Repository
public interface StoreBusinessInfoRepository extends JpaRepository<StoreBusinessInfo, Long> {
}
