package com.example.fitconnect.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitconnect.dto.MemberDto;
import com.example.fitconnect.dto.TrainerCalendarDto;
import com.example.fitconnect.service.TrainerCalendarService;

import jakarta.websocket.server.PathParam;
import lombok.Delegate;

@RestController
public class TrainerCalendarController {

	@Autowired private TrainerCalendarService service;
	
	
	@GetMapping("/trainercalendar/{trainerNum}")
	public Map<String, Object> calendarList(@PathVariable("trainerNum") int trainerNum) {
		List<TrainerCalendarDto> calList = service.selectCalenList(trainerNum);
		List<MemberDto> memList = service.selectMemberList(trainerNum);
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("calList", calList);
		map.put("memList", memList);
		
		return map;
	}
	
	@PostMapping("/trainercalendar/{trainerNum}")
	public Map<String, Object> insertCal(@PathVariable("trainerNum") int trainerNum,  TrainerCalendarDto dto){
		service.addSchedule(dto);
		Map<String, Object> map = new HashMap<String, Object>();
		return Map.of("isSuccess", true);
	}
	
	@PutMapping("/trainercalendar/{calendarId}")
	public TrainerCalendarDto updateCal(@PathVariable("calendarId") int calendarId, TrainerCalendarDto dto){
		service.updateSchedule(dto);
		return dto;
		
	}
	
	@DeleteMapping("/trainercalendar/{calendarId}")
	public Map<String, Object> deleteCal(@PathVariable("calendarId") int calendarId){
		Map<String, Object> map = new HashMap<String, Object>();
		return Map.of("isSuccess", true);
	}
	
	@GetMapping("/trainer/list/{trainerNum}")
	public Map<String, Object> memberList(@PathVariable("trainerNum") int trainerNum){
		List<MemberDto> list=service.selectMemberList(trainerNum);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberList", list);
		
		return map;
	}
	
	@GetMapping("trainer/detali/{memberNum}")
	public Map<String, Object> memberOne(@PathVariable("memberNum") int memberNum, MemberDto dto){
		return service.seleteMemberOne(dto);
	}
	
	@DeleteMapping("trainer/detali/{memberNum}")
	public Map<String, Object> disconnectMember(@PathVariable("memberNum") int memberNum){
		return Map.of("isSuccess", true);
	}
}
