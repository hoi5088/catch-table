package com.byyun.ri.sample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.byyun.ri.domain.model.sample.MemberDto;
import com.byyun.ri.domain.model.sample.MemberModel;
import com.byyun.ri.sample.dto.SampleRequest;
import com.byyun.ri.sample.dto.SampleResponse;

@Mapper(componentModel = "spring")
public interface SampleDtoMapper {
	SampleDtoMapper INSTANCE = Mappers.getMapper(SampleDtoMapper.class);

	SampleResponse toDto(MemberModel model);

	MemberDto toRequest(SampleRequest request);
}
