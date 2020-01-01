/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.Counter;
//import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.BoschCMD;


/**
 * Add your docs here.
 */
public class BoschMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //'now created one Talon object, and define the channel they are plugged into'
  //'make it private, to ensure it's not accessed anywhere else'
private Talon boschMotor = new Talon(RobotMap.PWM_BOSCHMOTOR);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new BoschCMD());//this will be a new instance of the command
    // and when this command is finished, it is destroyed.
    // note any variables will be destroyed as well.
  }

  //"secondly, make a couple of methods to set the motor speed, to 
  //  control the created object - the motors
  public void setBosch(double speed) {
    boschMotor.set(speed);
  }

}
