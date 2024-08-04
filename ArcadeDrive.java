package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(group="@Coaches Institute")
public class ArcadeDrive extends OpMode {
    public static final double RIGHT_HANDICAP = 0.8;
    public static final double LEFT_HANDICAP = 0.8;
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        telemetry.addData("Programmer", "Vincent");
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        // if the negative Y bothers you ...
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        // trade 10% power/speed, for better accuracy/control
        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y * LEFT_HANDICAP;
        double leftX = gamepad1.left_stick_x * RIGHT_HANDICAP;

        telemetry.addData("l_y", leftY);
        telemetry.addData("l_x", leftX);

        double leftSpeed = leftY + leftX;
        double rightSpeed = leftY - leftX;

        setPowers(leftSpeed, rightSpeed);
    }

    // this "normalizes" the inputs since the motors max at 1.0, but adding the leftY and leftX can be up to 2.0
    private void setPowers(double leftSpeed, double rightSpeed) {
        double maxSpeed = 1.0;

        maxSpeed = Math.max(maxSpeed, Math.abs(leftSpeed));
        maxSpeed = Math.max(maxSpeed, Math.abs(rightSpeed));

        leftSpeed = leftSpeed / maxSpeed;
        rightSpeed = rightSpeed / maxSpeed;

        leftMotor.setPower(leftSpeed);
        rightMotor.setPower(rightSpeed);
    }
}
