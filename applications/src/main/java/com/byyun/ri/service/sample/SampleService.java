package com.byyun.ri.service.sample;

import org.springframework.stereotype.Service;

import com.byyun.ri.domain.model.sample.MemberDto;
import com.byyun.ri.domain.model.sample.MemberModel;
import com.byyun.ri.domain.port.api.sample.SampleServicePort;
import com.byyun.ri.domain.port.spi.sample.SampleJpaPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService implements SampleServicePort {
	private final SampleJpaPort sampleJpaPort;

	@Override
	public MemberModel sample(MemberDto memberDto) {
		Long id = 1L;
		return sampleJpaPort.getSample(id);
	}
}
