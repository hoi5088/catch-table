package com.byyun.service;

import org.springframework.stereotype.Service;

import com.byyun.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	private final MemberRepository repository;
	public void sample() {
		//repository
	}
}
