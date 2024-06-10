// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShitConst;

public class Shit extends SubsystemBase {
  private TalonFX m_momoLShooter;
  private TalonFX m_appaRShooter;

  /** Creates a new Shit. */
  public Shit() {
    m_momoLShooter = new TalonFX(ShitConst.kMomoChannel);
    m_appaRShooter = new TalonFX(ShitConst.kAppaChannel);
  }

  public void ss(double s) {
    m_momoLShooter.set(s);
    m_appaRShooter.set(s);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
