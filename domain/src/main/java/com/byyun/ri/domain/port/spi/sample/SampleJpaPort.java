package com.byyun.ri.domain.port.spi.sample;

import com.byyun.ri.domain.model.sample.MemberModel;

public interface SampleJpaPort {
	MemberModel getSample(Long id);
}
