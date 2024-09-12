package com.example.fitconnect.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Alias("memberDto")
public class MemberDto {
	private int userNum;
	private int memberNum;
	private int trainerNum;
	private int height;
	private int weight;
	private String gender;
	private String plan;
	private String weeklyPlan;
	private String userName;
}
