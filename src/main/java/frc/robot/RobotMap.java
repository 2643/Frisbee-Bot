/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // Drive Motors Ports
  public static int FrontLeftMotorPort = 1;
  public static int BackLeftMotorPort = 2;
  public static int FrontRightMotorPort = 4;
  public static int BackRightMotorPort = 3;

  //Frisbee Shoot Motor Ports
  public static int FirstShooterMotorPort = 5;
  public static int SecondShooterMotorPort = 0;
  //First motor is closer to the frisbees than the second motor

  //Drive motors
  public static Spark FrontLeftMotor = new Spark(FrontLeftMotorPort);
  public static Spark BackLeftMotor = new Spark(BackLeftMotorPort);
  public static Spark FrontRightMotor = new Spark(FrontRightMotorPort);
  public static Spark BackRightMotor = new Spark(BackLeftMotorPort);

  //Frisbee motors
  public static Spark FirstShooterMotor = new Spark(FirstShooterMotorPort);
  public static Spark SecondShooterMotor = new Spark(SecondShooterMotorPort);

  //Drive variables
  public static int RightDriverAxis = 5;
  public static int LeftDriverAxis = 1;
  public static double SpeedMultiplier = 0.5;

  //Frisbee Shooter variables
  public static double FrisbeeMotorSpeed = 1;

  //Driver Joystick button variables
  public static int slowModeButtonNumber = 2;
  public static int SpinMotorButtonNumber = 5;
  public static int LaunchFrisbeeButtonNumber = 1;

  //Sloenoid values to fire
  public static DoubleSolenoid shootingSolenoid = new DoubleSolenoid(1, 2);

  //Fire Timer
  public static int fireTime = 1;

}
