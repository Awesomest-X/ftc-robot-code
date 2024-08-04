package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@Coaches Institute")
public class MotorControl extends OpMode {
    DcMotor motor;

    @Override
    public void init() {
        telemetry.addData("Programmer", "Vincent");
        motor = hardwareMap.get(DcMotor.class, "motor");
    }

    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;
        telemetry.addData("l_y", leftY);
        motor.setPower(leftY);
        telemetry.addData("motor pos", motor.getCurrentPosition());
    }
}
