package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.RobotMap;
import org.usfirst.frc.team5119.robot.commands.Actuator;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ActuatorSubsystem extends Subsystem {
	protected AnalogInput feedback = new AnalogInput(RobotMap.actuatorFeedback);
	protected TalonSRX actuator = new TalonSRX(RobotMap.actuatorMotor);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new Actuator());
	}
	
	public void move(double speed) {
		actuator.set(speed);
	}
	
	public double getPosition() {
		return feedback.getAverageVoltage()/5;
	}
}
