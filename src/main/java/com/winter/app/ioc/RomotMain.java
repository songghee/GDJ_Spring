package com.winter.app.ioc;

public class RomotMain {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.getLeftArm().act();
		
		
		
//		Robot robot = new Robot();
//		
//		robot.getLeftArm().act();
//		
//		robot=null;
//		
//		LeftArm leftArm= new LeftArm();
//		RightArm rightArm= new RightArm();
//		robot = new Robot(leftArm, rightArm);
//		
//		//로봇이 사라져도 팔 선언했으므로 팔은 사용 가능
//		robot = null;
//		
//		//setter
//		robot.setLeftArm(leftArm);

	}

}
