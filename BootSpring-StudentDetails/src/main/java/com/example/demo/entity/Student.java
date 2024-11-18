package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "StudentInfo")
public class Student {

	private Integer roll;
	private String name;
	private Double fee;
	private String addr;
}
