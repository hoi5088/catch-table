package com.byyun.ri.domain.port.api.sample;

import com.byyun.ri.domain.model.sample.MemberDto;
import com.byyun.ri.domain.model.sample.MemberModel;

public interface SampleServicePort {
	MemberModel sample(MemberDto memberDto);  //test
}
