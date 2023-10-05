package com.byyun.ri.persistence.sample;

import org.springframework.stereotype.Component;

import com.byyun.ri.domain.model.sample.MemberModel;
import com.byyun.ri.domain.port.spi.sample.SampleJpaPort;
import com.byyun.ri.persistence.repository.MemberRepository;
import com.byyun.ri.persistence.sample.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SampleAdapter implements SampleJpaPort {
	private final MemberRepository memberRepository;
	@Override
	public MemberModel getSample(Long id) {
		return SampleMapper.INSTANCE.to(memberRepository.findById(id).orElse(null));
	}
}
