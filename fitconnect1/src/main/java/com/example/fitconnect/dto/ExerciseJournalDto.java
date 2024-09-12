package com.example.fitconnect.dto;


import org.apache.ibatis.type.Alias;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("exerciseJournalDto")
public class ExerciseJournalDto {
	private int journalId;
	private int memberNum;
	private int memberCalNum;
	private int exerciseOrder;
	private int exerciseId;
	private int exerciseSet;
	private int exerciseCount;
	private int exerciseWeight;
	private String duration;
}
