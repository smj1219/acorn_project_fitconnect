package com.example.fitconnect.service;

import java.sql.Date;
import java.util.List;

import com.example.fitconnect.dto.ExerciseJournalDto;
import com.example.fitconnect.repository.ExerciseListDao;

public interface ExerciseService {

	public List<ExerciseJournalDto> selectAll(ExerciseJournalDto dto);
	public ExerciseListDao exerSelectOne(int exerciseId);
	public void addExercise(ExerciseJournalDto dto);
	public void deleteExer(int journalld);
	public void update(ExerciseJournalDto dto);
	public List<ExerciseListDao> selectExetAll();
	public List<ExerciseListDao> seleteCategory(String exerciseCate);
}
