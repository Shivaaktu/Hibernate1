package com.shiva.package1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class Student {
	@Id
	private int Id;
	private int age;
	private String name;
	private int mob;

}
