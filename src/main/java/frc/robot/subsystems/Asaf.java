// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Asaf extends SubsystemBase {
  /** Creates a new Asaf. */
  private CANSparkMax m_Shraga;

  public Asaf() {
    m_Shraga = new CANSparkMax(Constants.AsafConstants.kShragaPort, MotorType.kBrushless);
  }

  public void teesof_shragaSpeed(double speed) {
    m_Shraga.set(-speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
