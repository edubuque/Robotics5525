package org.usfirst.frc.team5525.robot.subsystems;

import org.usfirst.frc.team5525.robot.commands.Lifter_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter_Subsystem extends Subsystem {

   Spark motor_Lifter = new Spark(7);

    public void initDefaultCommand() {
        setDefaultCommand(new Lifter_Command());
    }
    
    public void Lift(Joystick controller)
    {
    	motor_Lifter.set(controller.getRawAxis(7));
    }
    
    public void Stop()
    {
    	motor_Lifter.set(0);
    }
}

