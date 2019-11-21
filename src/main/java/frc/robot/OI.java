  /*----------------------------------------------------------------------------*/
  /* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
  /* Open Source Software - may be modified and shared by FRC teams. The code   */
  /* must be accompanied by the FIRST BSD license file in the root directory of */
  /* the project.                                                               */
  /*----------------------------------------------------------------------------*/

  package frc.robot;

  import edu.wpi.first.wpilibj.Joystick;
  import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.FireFrisbee;
import frc.robot.commands.ShootFrisbee;

  /**
   * This class is the glue that binds the controls on the physical operator
   * interface to the commands and command groups that allow control of the robot.
   */
  public class OI {
    //Joysticks and Buttons
    public Joystick DriveStick = new Joystick(0);
    public JoystickButton slowModeButton = new JoystickButton(DriveStick, RobotMap.slowModeButtonNumber);
    public JoystickButton spinMotorButton = new JoystickButton(DriveStick, RobotMap.SpinMotorButtonNumber);
    public JoystickButton launchFrisbeeButton = new JoystickButton(DriveStick, RobotMap.LaunchFrisbeeButtonNumber);

    public OI(){
    //What the Button do
    spinMotorButton.whileHeld(new ShootFrisbee());
    launchFrisbeeButton.whenPressed(new FireFrisbee());
    }
    
  }
