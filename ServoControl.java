package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group="@Coaches Institute")
public class ServoControl extends OpMode {
    Servo servo;

    @Override
    public void init() {
        telemetry.addData("Programmer", "Vincent");
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;
        telemetry.addData("l_y", leftY);

        servo.setPosition(leftY);
    }
}
