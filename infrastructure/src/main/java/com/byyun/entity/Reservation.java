package com.byyun.entity;

import java.time.LocalDateTime;
import java.util.Date;

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
public class Reservation {
	@Id
	@GeneratedValue
	@Column(name = "reservation_id")
	private Long id;
	private Date date;
	private LocalDateTime time;
	private String status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "active_reservation_id")
	private ActiveReservation activeReservation;
}
