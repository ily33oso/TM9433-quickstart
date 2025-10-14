package org.firstinspires.ftc.teamcode.pedroPathing;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MecanumFieldOrientated extends OpMode {
    DcMotor lwheel, rwheel, intake;
    MecanumDrive drive = new MecanumDrive();
    double forward, strafe, rotate;

    @Override
    public void init() {
        drive.init(hardwareMap);


        if (gamepad2.a) {
            intake.setPower(.5);
        } else {
            intake.setPower(0);
        }

        if(gamepad2.y) {
            intake.setPower(-.5);
        } else {
            intake.setPower(0);
        }


        if (gamepad2.b) {
            lwheel.setPower(-1);
            rwheel.setPower(-1);
        } else {
            lwheel.setPower(0);
            rwheel.setPower(0);
        }
        if (gamepad2.x) {
            lwheel.setPower(1);
            rwheel.setPower(1);
        } else {
            lwheel.setPower(0);
            rwheel.setPower(0);
        }
    }

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        drive.driveFieldRelative(forward,strafe,rotate);
    }






}
