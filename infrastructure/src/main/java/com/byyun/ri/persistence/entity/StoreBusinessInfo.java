package com.byyun.ri.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor  // 기본 생성자
public class StoreBusinessInfo {
	@Id
	@Column(name = "store_id")
	private Long id;
	private int timeSlot;
	private int intervalDate;
	private int intervalTime;

	@OneToOne(mappedBy = "storeBusinessInfo")
	private Store store;
}
