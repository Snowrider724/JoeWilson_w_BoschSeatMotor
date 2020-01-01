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

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    // "we have to tell it the specific object, the actual instance 
    //  of the subsystem, not just the class in general which is 'DriveTrain'"
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {// not needed as we control continuously
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // get the value from the controller, and send it to the DriveTrain...
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.XBOX_LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.XBOX_RIGHT_STICK_Y);

    //take these stick settings and send them to the motors...
    Robot.driveTrain.setLeftMotor(leftStickY);
    Robot.driveTrain.setRightMotor(rightStickY);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns trued
  @Override
  protected void end() {
    //this makes sure the motors are turned off at the end:
    //Joe says if anything happens with the drivetrain, first the motors will stop.
    Robot.driveTrain.setLeftMotor(0.);
    Robot.driveTrain.setRightMotor(0.);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
