/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  private final Spark LeftDriveFront;
  private final Spark LeftDriveBack;
  private final Spark RightDriveFront;
  private final Spark RightDriveBack;




  public Drive(Spark l1, Spark l2, Spark r1, Spark r2) {
    LeftDriveFront= l1;
    LeftDriveBack = l2;
    RightDriveFront = r1;
    RightDriveBack = r2;
  }
  
  public void setLeftSpeed(double speed){
    LeftDriveFront.set(speed);
    LeftDriveBack.set(speed);
  }
  public void setRightSpeed(double speed){
    RightDriveFront.set(speed);
    RightDriveBack.set(speed);
  }
  public void setAllSpeed(double leftSpeed, double rightSpeed){
    setLeftSpeed(leftSpeed);
    setRightSpeed(rightSpeed);
  }
  public  void stopAllSpeed(){
    setAllSpeed(0, 0);
  }
  public void DriveWithJoystick(Joystick stick){
    setLeftSpeed(stick.getRawAxis(1));
    setRightSpeed(stick.getRawAxis(5));
  }



@Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }
}
