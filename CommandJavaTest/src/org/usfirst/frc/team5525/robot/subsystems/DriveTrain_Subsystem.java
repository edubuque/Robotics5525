package org.usfirst.frc.team5525.robot.subsystems;

import org.usfirst.frc.team5525.robot.RobotMap;
import org.usfirst.frc.team5525.robot.commands.TankDrive_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain_Subsystem extends Subsystem
{
	 Victor motor_BackLeft = new Victor(3);
	 Victor motor_FrontLeft = new Victor(2);
	 Victor motor_FrontRight = new Victor(0);
	 Victor motor_BackRight = new Victor(1);
	 
	 
	
	private RobotDrive leftDrive = new RobotDrive(motor_BackLeft,motor_FrontLeft);
	private RobotDrive rightDrive = new RobotDrive(motor_BackRight,motor_FrontRight);
	@Override
	protected void initDefaultCommand() 
	{
		setDefaultCommand(new TankDrive_Command());
		
	}
	
	public void TeleopDrive(Joystick controller)
	{
		motor_BackLeft.setInverted(true);
		motor_FrontLeft.setInverted(true);
		//leftDrive.tankDrive(controller.getRawAxis(1),controller.getRawAxis(1));
		//rightDrive.tankDrive(controller.getRawAxis(5),controller.getRawAxis(5));
		motor_BackLeft.set(controller.getRawAxis(1));
		motor_FrontLeft.set(controller.getRawAxis(1));
		motor_BackRight.set(controller.getRawAxis(5));
		motor_FrontRight.set(controller.getRawAxis(5));
		
	}
	
	public void Stop()
	{
		motor_BackLeft.set(0);
		motor_FrontLeft.set(0);
		motor_BackRight.set(0);
		motor_FrontRight.set(0);
	}
	

}
