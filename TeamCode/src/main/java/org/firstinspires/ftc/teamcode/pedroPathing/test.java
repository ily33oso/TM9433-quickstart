package org.firstinspires.ftc.teamcode.pedroPathing;


import com.qualcomm.hardware.motors.RevRobotics40HdHexMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class test {
    RevRobotics40HdHexMotor leftwheel = null;
    public void init(HardwareMap hwMap){
        leftwheel = hwMap.get(RevRobotics40HdHexMotor.class, "lw");


    }



}
