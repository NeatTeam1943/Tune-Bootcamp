// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private VictorSP m_rightMaster;
  private VictorSP m_rightSlave;
  private VictorSP m_leftMaster;
  private VictorSP m_leftSlave;

  public DriveTrain() {
    m_rightMaster = new VictorSP(0);
    m_rightSlave = new VictorSP(1);

    m_leftMaster = new VictorSP(2);
    m_leftSlave = new VictorSP(3);
  }

  public void Speed(double d) {
    m_leftMaster.set(d);
    m_leftSlave.set(d);
    m_rightMaster.set(d);
    m_rightSlave.set(d);
  }

  @Override
  public void periodic() {}


}
