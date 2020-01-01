/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class BoschCMD extends Command {
  public BoschCMD() {
    // Use requires() here to declare subsystem dependencies   
    // eg. requires(chassis);
    // 191231 the Bosch seat motor can be used!
    // "we have to tell it the specific object, the actual instance 
    //    of the subsystem, not just the class in general which is 'BoschMotor'"
      requires(Robot.boschMotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // get the value from the controller, and send it to the BoschMotor...
    double leftBumper = Robot.m_oi.GetDriverRawAxis(RobotMap.XBOX_LEFT_BUMPER);

    //take these stick settings and send them to the motor..
    Robot.boschMotor.setBosch(leftBumper);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
