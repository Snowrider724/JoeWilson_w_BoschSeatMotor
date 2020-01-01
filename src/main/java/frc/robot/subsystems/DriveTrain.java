/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //"now created two Spark objects, and define the channel they are plugged into"
  //"make them private, so ensure they are not accessed anywhere else"
  private Spark motorLeft = new Spark(RobotMap.PWM_DRIVETRAIN_MOTORLEFT);
  private Spark motorRight= new Spark(RobotMap.PWM_DRIVETRAIN_MOTORRIGHT);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new TankDrive()); //this will be a new instance of the command
                                        // and when this command is finished, it is destroyed.
                                        // note any variables will be destroyed as well.
  }

  //"secondly, make a couple of methods to set the motor speed, to 
  //  control the created object - the motors
  public void setLeftMotor(double speed) {
    motorLeft.set(speed);
  }
  public void setRightMotor(double speed) {
    motorRight.set(speed);
  }

}
