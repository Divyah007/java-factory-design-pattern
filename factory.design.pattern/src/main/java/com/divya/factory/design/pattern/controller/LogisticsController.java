package com.divya.factory.design.pattern.controller;


import java.lang.management.PlatformLoggingMXBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.factory.design.pattern.dto.LogisticsDto;
import com.divya.factory.design.pattern.service.factory.LogisticsServiceFactory;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class LogisticsController {
	
	@Autowired
	private LogisticsServiceFactory factory;
	public static final Logger log = LoggerFactory.getLogger(LogisticsController.class);
	
	@PostMapping("/logistics")
	public String postLogistics(@RequestBody LogisticsDto logistics) {
		  //log.info("This is an informational message.");
	log.info("hj======"+logistics.itemName);
	
	;

		
		return factory.logistics(logistics.itemName);
	}

}
