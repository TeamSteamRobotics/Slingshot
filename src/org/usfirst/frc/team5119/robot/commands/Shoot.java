package org.usfirst.frc.team5119.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5119.robot.Robot;

/**
 *
 */
public class Shoot extends Command {
	
	protected double target;
	protected double position;
	protected double difference;
	
	public Shoot() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.slingshotSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.slingshotSubsystem.shoot();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.slingshotSubsystem.stopShooting();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.slingshotSubsystem.stopShooting();
	}
}
