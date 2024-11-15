package com.shiva.spider;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Pendata")
public class Pen {
	
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	private int price;
	private boolean checked;

}
