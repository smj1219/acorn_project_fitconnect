package com.example.fitconnect.service;

import java.util.List;
import java.util.Map;

import com.example.fitconnect.dto.MemberDto;
import com.example.fitconnect.dto.TrainerCalendarDto;

public interface TrainerCalendarService {
	public List<TrainerCalendarDto> selectCalenList(int trainerNum);
	public TrainerCalendarDto selectCalenderOne(int calenderId);
	public void addSchedule(TrainerCalendarDto dto);
	public void updateSchedule(TrainerCalendarDto dto);
	public void deleteSchedule(int calenderId);
	
	
	public Map<String, Object> seleteMemberOne(MemberDto dto);
	public List<MemberDto> selectMemberList(int trainerNum); 
	public void disconnect(int memberNum);
}
