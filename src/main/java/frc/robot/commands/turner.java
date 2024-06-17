// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.ctre.phoenix6.mechanisms.swerve.SwerveModule.DriveRequestType;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class turner extends Command {
  private DriveTrain m_drivetrain;
  private Timer m_timer;
  private boolean m_inverterner;
  /** Creates a new turner. */
  public turner(DriveTrain driveTrain, boolean inverterner) {
    m_drivetrain = driveTrain;
    m_inverterner = inverterner;
    m_timer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_inverterner) {
      m_drivetrain.setSpeed(0, -0.4);
    }
    else {
      m_drivetrain.setSpeed(0, 0.4);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_timer.get() > 0.7;
  }
}
