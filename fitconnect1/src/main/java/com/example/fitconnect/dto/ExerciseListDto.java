package com.example.fitconnect.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("exerciseListDto")
public class ExerciseListDto {

	
	private int exerciseId;
	private String exerciseName;
	private String exerciseCate;
	private String info;
	private String saveImage;
	private MultipartFile image;
}
