package org.firstinspires.ftc.teamcode.pedroPathing;


//import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class teleyfiled extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your ID's match your configuration
      //  DcMotor fl = hardwareMap.dcMotor.get("fl"); // 0 top left
      //  DcMotor bl = hardwareMap.dcMotor.get("bl"); //1 bot left
        //DcMotor fr = hardwareMap.dcMotor.get("fr"); //2 fr
        //DcMotor br = hardwareMap.dcMotor.get("br"); //3




        DcMotor vacuum = hardwareMap.dcMotor.get("vacuum"); //0
        DcMotor lwheel = hardwareMap.dcMotor.get("lwheel");// 1
        DcMotor rwheel = hardwareMap.dcMotor.get("rwheel");// 2



      //  IMU imu= hardwareMap.get(IMU.class,"imu");


       // Reverse the right side motors. This may be wrong for your setup.
        // If your robot moves backwards when commanded to go forwards,
        // reverse the left side instead.
        // See the note about this earlier on this page.
        //fr.setDirection(DcMotorSimple.Direction.FORWARD);
        //br.setDirection(DcMotorSimple.Direction.REVERSE);
        //fl.setDirection(DcMotorSimple.Direction.FORWARD);
        //bl.setDirection(DcMotorSimple.Direction.REVERSE);

        //vacuum.setDirection(DcMotorSimple.Direction.FORWARD);
        lwheel.setDirection(DcMotorSimple.Direction.FORWARD);
        rwheel.setDirection(DcMotorSimple.Direction.REVERSE);



        // Retrieve the IMU from the hardware map
       // IMU imu = hardwareMap.get(IMU.class, "imu");
        // Adjust the orientation parameters to match your robot
       /* IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,//
                RevHubOrientationOnRobot.UsbFacingDirection.BACKWARD));// CHECK THIS TO MAKE SURE ITS RIGHT
        // Without this, the REV Hub's orientation is assumed to be logo up / USB forward
        imu.initialize(parameters);
*/
        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y; // Remember, Y stick value is reversed
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            // This button choice was made so that it is hard to hit on accident,
            // it can be freely changed based on preference.
            // The equivalent button is start on Xbox-style controllers.
            /*
            if (gamepad1.options) {
                imu.resetYaw();
            }

            double botHeading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);

            // Rotate the movement direction counter to the bot's rotation
            double rotX = x * Math.cos(-botHeading) - y * Math.sin(-botHeading);
            double rotY = x * Math.sin(-botHeading) + y * Math.cos(-botHeading);

            rotX = rotX * 1.1;  // Counteract imperfect strafing

            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio,
            // but only if at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(rotY) + Math.abs(rotX) + Math.abs(rx), 1);
            double frontLeftPower = (rotY + rotX + rx) / denominator;
            double backLeftPower = (rotY - rotX + rx) / denominator;
            double frontRightPower = (rotY - rotX - rx) / denominator;
            double backRightPower = (rotY + rotX - rx) / denominator;
/*
            fl.setPower(frontLeftPower);
            bl.setPower(backLeftPower);
            fr.setPower(frontRightPower);
            br.setPower(backRightPower);
*/
           /*
            if (gamepad2.a) {
                vacuum.setPower(.5);
            } else {
                vacuum.setPower(0);
            }
*/
            if (gamepad2.b) {
                lwheel.setPower(-1);
                rwheel.setPower(-1);
            } else {
                lwheel.setPower(0);
                rwheel.setPower(0);
            }

        }
    }
}
