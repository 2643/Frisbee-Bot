/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Frisbee extends Subsystem {
  private final Spark FirstShooterMotor;
  private final Spark SecondShooterMotor;

  public Frisbee(Spark f1, Spark f2) {
    FirstShooterMotor = f1;
    SecondShooterMotor = f2;
  }
  public void SpinMotor(double speed){
    FirstShooterMotor.set(speed);
    SecondShooterMotor.set(speed);
  }
  public void StopMotor(){
    SpinMotor(0);
  }
  

@Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
