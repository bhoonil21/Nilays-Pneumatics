package org.usfirst.frc.team2976.robot.subsystems;


import org.usfirst.frc.team2976.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClampSubsystem extends Subsystem {
	Solenoid clampSolenoid = new Solenoid(RobotMap.solenoidPort);
	
	public void clampOut() {
		clampSolenoid.set(true);
	}
	public void clampIn() {
		clampSolenoid.set(false);
	}
	public boolean getClampState() {
		return clampSolenoid.get();
	}
    public void initDefaultCommand() {
    	
    }
}

