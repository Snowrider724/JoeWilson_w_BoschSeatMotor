/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //--------------------------------------------------------PWM ports
  public static final int PWM_DRIVETRAIN_MOTORLEFT  = 0;  
  public static final int PWM_DRIVETRAIN_MOTORRIGHT = 1;  
  public static final int            PWM_BOSCHMOTOR = 2;

  //--------------------------------------------------------Xbox axis numbers
  public static final int        XBOX_LEFT_STICK_Y  = 1;  
  public static final int        XBOX_RIGHT_STICK_Y = 5; 
  public static final int        XBOX_LEFT_BUMPER   = 2;
  //--------------------------------------------------------USB ports on DS PC
  public static final int         DRIVER_CONTROLLER = 0;





  
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
