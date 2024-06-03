package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Appointment {
	private Long doctorId;
	private Long patientId;
	private LocalDateTime timeAndDate;
	private String description;
	

}
