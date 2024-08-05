package com.aurionpro.isp.violation.test;

import com.aurionpro.isp.violation.model.IWorker;
import com.aurionpro.isp.violation.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class IWokerTest {

	public static void main(String[] args) {
		
		IWorker labour = new Labour();
		
		IWorker robot = new Robot();
		
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		
		
		robot.startWork();
		robot.stopWork();
		robot.drink();
		robot.eat();

	}

}
