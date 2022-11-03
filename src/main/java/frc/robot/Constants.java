// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class Shooter {
        public static final int right_shooter_motor = 15;
        public static final int left_shooter_motor = 16;
        public static final int upper_shoot_speed = 1;
    }
    public static final class Drivetrain {
        public static final int right_front = 13;
        public static final int left_front = 11;
        public static final int right_rear = 14;
        public static final int left_rear = 12;
    }
}
