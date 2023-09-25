package com.byyun.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor  // 기본 생성자
public class BusinessHour {
	@Id
	@GeneratedValue
	@Column(name = "business_id")
	private Long id;
	private int businessStartDate;
	private int businessEndDate;
	private String dayType;
	private String businessType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private Store store;
}
