package com.example.fitconnect.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.fitconnect.dto.ExerciseJournalDto;
import com.example.fitconnect.dto.ExerciseListDto;
import com.example.fitconnect.repository.ExerciseListDao;

public class ExerciseServiceImpl implements ExerciseService {

	@Autowired private ExerciseListDto listDao;
	@Autowired private ExerciseJournalDto journalDao;
	
	@Value("${file.location}")
	private String fileLocation;
	
	@Override
	public List<ExerciseJournalDto> selectAll(ExerciseJournalDto dto) {
		return null;
	}

	@Override
	public ExerciseListDao exerSelectOne(int exerciseId) {
		return null;
	}

	@Override
	public void addExercise(ExerciseJournalDto dto) {
		
	}

	@Override
	public void deleteExer(int journalld) {
		
	}

	@Override
	public void update(ExerciseJournalDto dto) {
		
	}

	@Override
	public List<ExerciseListDao> selectExetAll() {
		return null;
	}

	@Override
	public List<ExerciseListDao> seleteCategory(String exerciseCate) {
		
	}

}
