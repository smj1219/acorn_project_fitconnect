package com.example.fitconnect.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.fitconnect.dto.MemberDto;
import com.example.fitconnect.dto.TrainerCalendarDto;
import com.example.fitconnect.repository.TrainerCalendarDao;
@Service
public class TrainerCalendarServiceImpl implements TrainerCalendarService  {

	@Autowired TrainerCalendarDao calDao;
	
	@Value("${file.location}")
	private String fileLocation;
	
	
	@Override
	public List<TrainerCalendarDto> selectCalenList(int trainerNum) {
		return calDao.getCalenList(trainerNum);
	}

	@Override
	public TrainerCalendarDto selectCalenderOne(int calenderId) {
		return calDao.getCalender(calenderId);
	}

	@Override
	public void addSchedule(TrainerCalendarDto dto) {
		dto.setCalendarId(dto.getCalendarId());
		calDao.insert(dto);
	}

	@Override
	public void updateSchedule(TrainerCalendarDto dto) {
		 calDao.update(dto);
	}

	@Override
	public void deleteSchedule(int calenderId) {
		calDao.delete(calenderId);
	}

	@Override
	public Map<String, Object> seleteMemberOne(MemberDto dto) {
		String userName = calDao.getUserName(dto.getMemberNum());
		MemberDto resultDto = calDao.getMember(dto);
		
		resultDto.setUserName(userName);
		
		return Map.of("dto", resultDto);
	}

	@Override
	public List<MemberDto> selectMemberList(int trainerNum) {
		return calDao.getMemberList(trainerNum);
	}

	@Override
	public void disconnect(int memberNum) {
		calDao.disconnect(memberNum);
		
	}

}
