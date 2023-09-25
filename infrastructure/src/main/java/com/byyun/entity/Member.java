package com.byyun.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor // 모든 생성자
@NoArgsConstructor  // 기본 생성자
public class Member {
	@Id
	@GeneratedValue
	@Column(name = "member_id")
	private Long id;
	private String name;
	private String phone;

	@OneToMany(mappedBy = "member")
	private List<ActiveReservation> activeReservations = new ArrayList<>();
}
