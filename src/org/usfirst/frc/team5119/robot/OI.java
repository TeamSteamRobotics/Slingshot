package org.usfirst.frc.team5119.robot;

import org.usfirst.frc.team5119.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public final Joystick stick = new Joystick(0);
	
	public final Button shoot = new JoystickButton(stick, 1);
	
	public OI() {
		shoot.whileHeld(new Shoot());
	}
}
