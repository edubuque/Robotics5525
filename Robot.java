/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5525.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends IterativeRobot {
	private DifferentialDrive left_myRobot;
	private DifferentialDrive right_myRobot;
	private DifferentialDrive whole_myRobot;
	private Joystick m_leftStick;

	@Override
	public void robotInit() {
		left_myRobot = new DifferentialDrive(new Talon(0),new Talon(2))
		right_myRobot = new DifferentialDrive(new Talon(3), new Talon(4));
		whole_myRobot = new DifferentialDrive(left_myRobot,right_myRobot);
		m_leftStick = new Joystick(0);
	}

	@Override
	public void teleopPeriodic() {
		whole_myRobot.tankDrive(m_leftStick.getY(3), m_leftStick.getY(4));
	}
}
