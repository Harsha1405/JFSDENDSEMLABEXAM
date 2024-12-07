package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Tablet")
public class Tablet extends Device{
	private int Screensize;
	private String Batterylife;
	public int getScreensize() {
		return Screensize;
	}
	public void setScreensize(int screensize) {
		Screensize = screensize;
	}
	public String getBatterylife() {
		return Batterylife;
	}
	public void setBatterylife(String batterylife) {
		Batterylife = batterylife;
	}
	

}
