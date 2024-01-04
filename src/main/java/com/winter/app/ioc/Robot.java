package com.winter.app.ioc;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Robot {
	
	
	private LeftArm leftArm;
	
	@Inject
	private RightArm rightArm;
	
	//팔, 왼쪽, 오른쪽
	public  Robot() {
//		this.leftArm= new LeftArm();
//		this.rightArm= new RightArm();
		
	}
	
	public Robot(LeftArm leftArm, RightArm rightArm) {
		this.leftArm= leftArm;
		this.rightArm= rightArm;
	}
	
	
	
	public LeftArm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}

	public RightArm getRightArm() {
		return rightArm;
	}

	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	//다리
}
