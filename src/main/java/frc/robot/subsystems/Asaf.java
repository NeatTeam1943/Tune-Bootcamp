// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Asaf extends SubsystemBase {
  /** Creates a new Asaf. */
  private VictorSP m_Shraga;
  public Asaf() {
    m_Shraga = new VictorSP(1);
  }

  public void teesof_shragaSpeed(double speed) {
    m_Shraga.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
