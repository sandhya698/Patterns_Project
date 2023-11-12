package com.springproj.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * @author - Sandhya paladugu
 */

@Entity
public class Trainer {
	@Id
	private int trainerId;
	private String trainerFirstName;
	private String trainerLastName;
	public int getTrainerId() {
		return trainerId;
	}
	public String getTrainerFirstName() {
		return trainerFirstName;
	}
	public String getTrainerLastName() {
		return trainerLastName;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public void setTrainerFirstName(String trainerFirstName) {
		this.trainerFirstName = trainerFirstName;
	}
	public void setTrainerLastName(String trainerLastName) {
		this.trainerLastName = trainerLastName;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerFirstName=" + trainerFirstName + ", trainerLastName="
				+ trainerLastName + "]";
	}
	
}
