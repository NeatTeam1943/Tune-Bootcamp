// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.lgbtqConstants;
import frc.robot.subsystems.lgbtqdeluxepremium;

public class TransSurgery extends Command {
  private lgbtqdeluxepremium m_lgbtqLgbtqdeluxepremium;

  /** Creates a new TransSurgery. */
  public TransSurgery(lgbtqdeluxepremium lgbtqdeluxepremium) {
    m_lgbtqLgbtqdeluxepremium = lgbtqdeluxepremium;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_lgbtqLgbtqdeluxepremium);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_lgbtqLgbtqdeluxepremium.transSpeed(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_lgbtqLgbtqdeluxepremium.transSpeed(lgbtqConstants.kTransSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_lgbtqLgbtqdeluxepremium.transSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
