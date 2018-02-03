package org.usfirst.frc.team5525.robot.commands;

import org.usfirst.frc.team5525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Lifter_Command extends Command {

    public Lifter_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Lifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Lifter.Lift(Robot.m_oi.getJoystick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Lifter.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
