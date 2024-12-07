package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SmartPhone")
public class Smartphone extends Device{
	private String OperatingSystem;
	private String CameraResolution;
	public String getOperatingSystem() {
		return OperatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	public String getCameraResolution() {
		return CameraResolution;
	}
	public void setCameraResolution(String cameraResolution) {
		CameraResolution = cameraResolution;
	}
	

}
