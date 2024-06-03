// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.AsafCommand;
import frc.robot.subsystems.Asaf;
import frc.robot.commands.ShootShit;
import frc.robot.subsystems.Shit;
import frc.robot.commands.TransSurgery;
import frc.robot.subsystems.lgbtqdeluxepremium;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Asaf m_Asaf = new Asaf();
  private final AsafCommand m_AsafCommand = new AsafCommand(m_Asaf);
  public final Shit m_shit = new Shit();
  public final ShootShit m_shootShit = new ShootShit(m_shit);
  private final lgbtqdeluxepremium m_Lgbtqdeluxepremium = new lgbtqdeluxepremium();
  private final TransSurgery m_TransSurgery = new TransSurgery(m_Lgbtqdeluxepremium);
  private DriveTrain m_drive = new DriveTrain();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    m_driveTrain.setDefaultCommand(
      new RunCommand(() ->
        m_drive.setSpeed(m_driverController.getRightTriggerAxis()-m_driverController.getLeftTriggerAxis(), 
        m_driverController.getLeftX()), 
        m_drive));
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    m_driverController.x().whileTrue(m_AsafCommand);
    m_driverController.a().whileTrue(m_shootShit);
    m_driverController.b().whileTrue(m_TransSurgery);
  }
}
