package com.ecommerce.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Current_Admin_session {

	private Integer user_id;
	private String uuid;
	private LocalDate date;
	
}
