package org.firstinspires.ftc.teamcode.pedroPathing;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name= "Auto 0", group = "Autonomous")

public class auto extends LinearOpMode{
    DcMotor fl = null; // 0 top left
    DcMotor bl = null;//1 bot left
    DcMotor fr =  null;//2 fr
    DcMotor br =null; //3
    ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize hardware
        fl = hardwareMap.get(DcMotor.class, "fl");
        bl = hardwareMap.get(DcMotor.class, "bl");
        fr = hardwareMap.get(DcMotor.class, "fr");
        br = hardwareMap.get(DcMotor.class, "br");



        //set motor directions (adjust as needed for your robot)
        fl.setDirection(DcMotor.Direction.FORWARD);
        bl.setDirection(DcMotor.Direction.REVERSE);
        fr.setDirection(DcMotor.Direction.FORWARD);
        br.setDirection(DcMotor.Direction.FORWARD);



        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        runtime.reset();



        // Autonomous actions
        if (opModeIsActive()) {
            // Drive forward for 2 seconds
            fl.setPower(0.5);
            bl.setPower(0.5);
            fr.setPower(0.5);
            br.setPower(0.5);
            while (opModeIsActive() && runtime.seconds() <2.0) {
                telemetry.addData("Path", "Driving Forward: %4.1f S Elapsed", runtime.seconds());
                telemetry.update();
            }

            // Stop motors
            fl.setPower(0);
            bl.setPower(0);
            fr.setPower(0);
            br.setPower(0);
        }
    }
}
