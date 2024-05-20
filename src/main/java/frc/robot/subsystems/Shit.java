// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShitConst;

public class Shit extends SubsystemBase {
  private Talon m_momo;
  private Talon m_appa;


  /** Creates a new Shit. */
  public Shit() {
    m_momo = new Talon(ShitConst.kMomoChannel);
    m_appa = new Talon(ShitConst.kAppaChannel);
  }

  public void ss(double s) {
    m_momo.set(-s);
    m_appa.set(s);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
