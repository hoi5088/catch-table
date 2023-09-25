package com.byyun.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor  // 기본 생성자
public class Store {
	@Id
	@GeneratedValue
	@Column(name = "store_id")
	private Long id;
	private String name;

	@OneToMany(mappedBy = "store")
	private List<ActiveReservation> activeReservations = new ArrayList<>();

	@OneToMany(mappedBy = "store")
	private List<Seat> seats = new ArrayList<>();
}
