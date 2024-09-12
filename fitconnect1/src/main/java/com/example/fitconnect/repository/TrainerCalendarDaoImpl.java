package com.example.fitconnect.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.fitconnect.dto.MemberDto;
import com.example.fitconnect.dto.TrainerCalendarDto;

@Repository
public class TrainerCalendarDaoImpl implements TrainerCalendarDao {
	
	@Autowired private SqlSession session;

	@Override
	public List<TrainerCalendarDto> getCalenList(int trainerNum) {
		
		return session.selectList("TrainerCalendar.getList", trainerNum);
	}

	@Override
	public TrainerCalendarDto getCalender(int calenderId) {
		
		return session.selectOne("TrainerCalendar.getSchedule", calenderId);
	}

	@Override
	public void insert(TrainerCalendarDto dto) {
		session.insert("TrainerCalendar.insert", dto);
	}

	@Override
	public void update(TrainerCalendarDto dto) {
		session.update("TrainerCalendar.update", dto);
	}

	@Override
	public void delete(int calenderId) {
		session.delete("TrainerCalendar.delete", calenderId);
	}

	@Override
	public MemberDto getMember(MemberDto dto) {
		return session.selectOne("TrainerCalendar.getMember", dto);
	}

	@Override
	public List<MemberDto> getMemberList(int trainerNum) {
		return session.selectList("TrainerCalendar.getMemberAll", trainerNum);
	}

	@Override
	public void disconnect(int memberNum) {
		session.delete("TrainerCalendar.disconnect", memberNum);
	}

	@Override
	public String getUserName(int memberNum) {
		String memberName=session.selectOne("TrainerCalendar.getUserName", memberNum);
		return memberName;
	}


}
