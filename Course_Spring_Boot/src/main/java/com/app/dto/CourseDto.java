package com.app.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
	private String title;
	private LocalDate start_date;
	private LocalDate end_date;
	private double fee;
	private double min_score;

}
