package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SlingshotSubsystem extends Subsystem {
	
	protected DigitalOutput trigger = new DigitalOutput(RobotMap.shootMotor);

	public void initDefaultCommand() {
		
	}
	
	public void shoot() {
		trigger.set(true);
	}
	
	public void stopShooting() {
		trigger.set(false);
	}
}
