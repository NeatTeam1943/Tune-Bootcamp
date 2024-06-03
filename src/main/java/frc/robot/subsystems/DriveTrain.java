// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private TalonFX m_rightMaster;
  private TalonFX m_rightSlave;
  private TalonFX m_leftMaster;
  private TalonFX m_leftSlave;
  private DifferentialDrive m_driveTrain;

  public DriveTrain() {
    m_rightMaster = new TalonFX(0);
    m_leftMaster = new TalonFX(2);

    m_leftSlave.setControl(new Follower(m_leftMaster.getDeviceID(), false));
    m_rightSlave.setControl(new Follower(m_rightMaster.getDeviceID(), false));
    
    m_driveTrain = new DifferentialDrive(m_leftMaster, m_rightMaster);
  }

  public void setSpeed(double speed, double rotation) {
    m_driveTrain.arcadeDrive(speed, rotation);

  }

  @Override
  public void periodic() {}


}
