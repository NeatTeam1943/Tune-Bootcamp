// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ShitConst;
import frc.robot.subsystems.Shit;

public class ShootShit extends Command {
  private Shit m_shit;

  /** Creates a new ShootShit. */
  public ShootShit(Shit shit) {
    m_shit = shit;
    addRequirements(m_shit);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_shit.ss(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_shit.ss(ShitConst.kSSSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_shit.ss(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
