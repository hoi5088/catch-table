package com.byyun.ri.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byyun.ri.domain.port.api.sample.SampleServicePort;
import com.byyun.ri.sample.dto.SampleResponse;
import com.byyun.ri.sample.mapper.SampleDtoMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SampleController {
	private final SampleServicePort service;

	@GetMapping("/sample")
	public SampleResponse sample() {
		return SampleDtoMapper.INSTANCE.toDto(service.sample());
	}
}
