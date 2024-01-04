package com.winter.app.ioc;

public class Robot {
	private LeftArm leftArm;
	
	private RightArm rightArm;
	
	public  Robot() {
		this.leftArm= new LeftArm();
		this.rightArm= new RightArm();

	}

	public Robot(LeftArm leftArm, RightArm rightArm) {
		this.leftArm= leftArm;
		this.rightArm= rightArm;
	}
	//팔, 왼쪽, 오른쪽

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
