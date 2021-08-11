package com.example.DisBot.data.dto;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class AnarysisDto {
	private String loginCount;
	private String gameCount;
	private String playGameName;
	private String onlineStatus;
}
