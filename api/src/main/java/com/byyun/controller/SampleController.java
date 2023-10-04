package com.byyun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byyun.service.SampleService;

@RestController
public class SampleController {
	private SampleService service;

	@GetMapping("/sample")
	public void sample() {
		service.sample();
	}
}
