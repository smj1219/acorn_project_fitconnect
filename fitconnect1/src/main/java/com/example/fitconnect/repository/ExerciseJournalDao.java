package com.example.fitconnect.repository;

import java.util.List;

import com.example.fitconnect.dto.ExerciseJournalDto;

public interface ExerciseJournalDao {
	public List<ExerciseJournalDto> getList(ExerciseJournalDto dto);
	public ExerciseJournalDto getExer(int journalId);
	public void insert(ExerciseJournalDto dto);
	public void update(ExerciseJournalDto dto);
	public void delete(int journalId);
}
