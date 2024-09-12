package com.example.fitconnect.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExerciseListDaoImpl implements ExerciseListDao {

	@Autowired private SqlSession session;
	
	@Override
	public List<ExerciseListDao> getExerList() {
		return session.selectList("ExerciseList.getAll");
	}

	@Override
	public ExerciseListDao getDetail(int exerciseId) {
		return session.selectOne("ExerciseList.getOne", exerciseId);
	}

	@Override
	public List<ExerciseListDao> getcategory(String exerciseCate) {
		return session.selectList("ExerciseList.getCategory", exerciseCate);
	}

}
