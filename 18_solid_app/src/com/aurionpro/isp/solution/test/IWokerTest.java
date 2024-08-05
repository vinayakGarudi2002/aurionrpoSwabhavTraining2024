package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.ILunchTime;
import com.aurionpro.isp.solution.model.IWorker;
import com.aurionpro.isp.solution.model.Labour;
import com.aurionpro.isp.solution.model.Robot;
import com.aurionpro.isp.solution.model.Worker;

public class IWokerTest {

	public static void main(String[] args) {
		
		Labour labour = new Labour();
		
		Robot robot = new Robot();
		
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		
		
		robot.startWork();
		robot.stopWork();
		

	}

}
