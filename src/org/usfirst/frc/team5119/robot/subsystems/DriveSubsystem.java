package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.RobotMap;
import org.usfirst.frc.team5119.robot.commands.Drive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	
	protected  CANTalon frontLeft = new CANTalon(RobotMap.frontLeftMotor),
						frontRight = new CANTalon(RobotMap.frontRightMotor),
						backLeft = new CANTalon(RobotMap.backLeftMotor),
						backRight = new CANTalon(RobotMap.backRightMotor);
	protected RobotDrive drive = new RobotDrive(frontLeft,backLeft,frontRight,backRight);

	public void initDefaultCommand() {
		setDefaultCommand(new Drive());
	}
	
	public void drive(double speed, double turn) {
		drive.arcadeDrive(speed, turn, true);
	}
	
	public void driveNotSquared(double speed, double turn) {
		drive.arcadeDrive(speed, turn);
	}
}
