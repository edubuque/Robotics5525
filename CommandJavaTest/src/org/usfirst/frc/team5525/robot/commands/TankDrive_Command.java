package org.usfirst.frc.team5525.robot.commands;




import org.usfirst.frc.team5525.robot.OI;
import org.usfirst.frc.team5525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDrive_Command extends Command {

    public TankDrive_Command() {
        requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Robot.DriveTrain.TeleopDrive(Robot.m_oi.getJoystick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	Robot.DriveTrain.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
