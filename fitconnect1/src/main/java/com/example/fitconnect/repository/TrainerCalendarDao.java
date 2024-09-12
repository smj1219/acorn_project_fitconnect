package com.example.fitconnect.repository;

import java.util.List;

import com.example.fitconnect.dto.MemberDto;
import com.example.fitconnect.dto.TrainerCalendarDto;

public interface TrainerCalendarDao {
	public List<TrainerCalendarDto> getCalenList(int trainerNum);
	public TrainerCalendarDto getCalender(int calenderId);
	public void insert(TrainerCalendarDto dto);
	public void update(TrainerCalendarDto dto);
	public void delete(int calenderId);
	
	public MemberDto getMember(MemberDto dto);
	public List<MemberDto> getMemberList(int trainerNum); 
	// 특정 멤버아이디와 같은 아이디를 가진 유저의 이름 가져오기
	public String getUserName(int memberNum);
	//memberNum 을 가져가서 해당 멤버의 개인정보 내에서 trainerNum 삭제?
	public void disconnect(int memberNum);
	
}
