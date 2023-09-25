package com.byyun.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor  // 기본 생성자
public class Seat {
	@Id
	@GeneratedValue
	@Column(name = "seat_id")
	private Long id;
	private int count;

	@OneToMany(mappedBy = "seat")
	private List<ActiveReservation> activeReservations = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id")
	private Store store;
}
