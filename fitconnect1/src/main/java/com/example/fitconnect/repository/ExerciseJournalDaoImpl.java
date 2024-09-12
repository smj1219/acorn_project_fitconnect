package com.example.fitconnect.repository;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.fitconnect.dto.ExerciseJournalDto;

@Repository
public class ExerciseJournalDaoImpl implements ExerciseJournalDao {

	@Autowired private SqlSession session;
	
	@Override
	public List<ExerciseJournalDto> getList(ExerciseJournalDto dto) {
		return session.selectList("ExerciseJournal.getList", dto);
	}

	@Override
	public ExerciseJournalDto getExer(int journalId) {
		
		return session.selectOne("ExerciseJournal.getExerOne", journalId);
	}

	@Override
	public void insert(ExerciseJournalDto dto) {
		session.insert("ExerciseJournal.insert", dto);
		
	}

	@Override
	public void update(ExerciseJournalDto dto) {
		session.update("ExerciseJournal.update", dto);
		
	}

	@Override
	public void delete(int journalId) {
		session.delete("ExerciseJournal.delete", journalId);
		
	}

}
