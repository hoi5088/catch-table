package com.byyun.ri.sample.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SampleResponse {
	private Long id;
	private String name;
}
