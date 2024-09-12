package com.example.fitconnect.repository;

import java.util.List;

public interface ExerciseListDao {
	public List<ExerciseListDao> getExerList();
	public ExerciseListDao getDetail(int exerciseId);
	public List<ExerciseListDao> getcategory(String exerciseCate);
}
