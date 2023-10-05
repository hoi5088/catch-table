package com.byyun.ri.persistence.sample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.byyun.ri.domain.model.sample.MemberModel;
import com.byyun.ri.persistence.entity.Member;

@Mapper(componentModel = "spring")
public interface SampleMapper {
	SampleMapper INSTANCE = Mappers.getMapper(SampleMapper.class);
	MemberModel to(Member member);
}
