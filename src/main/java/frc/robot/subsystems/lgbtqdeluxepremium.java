// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.lgbtqConstants;

public class lgbtqdeluxepremium extends SubsystemBase {
  private CANSparkMax m_transMotor;

  /** Creates a new lgbtqiaplus. */
  public lgbtqdeluxepremium() {
    m_transMotor = new CANSparkMax(lgbtqConstants.kTransMotorChannel, MotorType.kBrushless);
  }

  public void transSpeed(double s) {
    m_transMotor.set(-s);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
