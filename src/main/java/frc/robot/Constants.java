// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class DriveTrainConstants {
    public static final int kLeftFront = 4;
    public static final int kLeftRear = 3;
    public static final int kRightFront = 1;
    public static final int kRightRear = 2;

    public static final double kWheelCircumference = 0.47;
    public static final double kGearboxRatio = 12.76;
  }

  public static class AsafConstants {
    public static final int kShragaPort = 5;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class ShitConst {
    public static final int kMomoChannel = 8;
    public static final int kAppaChannel = 9;

    public static final double kSSSpeed = 0.5;
  }
  
  public static class lgbtqConstants {
    public static final int kTransMotorChannel = 6;
    public static final double kTransSpeed = 0.5;
  }
}
