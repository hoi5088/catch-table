package com.byyun.ri.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	@OneToMany(mappedBy = "store")
	private List<BusinessHour> businessHours = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="store_id",referencedColumnName = "store_id")
	private StoreBusinessInfo storeBusinessInfo;
}
