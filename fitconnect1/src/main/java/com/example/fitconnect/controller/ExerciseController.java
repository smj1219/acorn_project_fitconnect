package com.example.fitconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitconnect.service.ExerciseService;

@RestController
public class ExerciseController {

	@Autowired private ExerciseService service;
	
	
}
