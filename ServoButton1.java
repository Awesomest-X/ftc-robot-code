package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(group = "@Coaches Institute")
public class ServoButton1 extends OpMode {
    public static final double CLAW_OPEN = 0.5;
    public static final int CLAW_CLOSED = 0;
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
        if (gamepad1.y) {
            servo.setPosition(CLAW_OPEN);
        } else {
            servo.setPosition(CLAW_CLOSED);
        }
        telemetry.addData("Servo Pos", servo.getPosition());
    }
}
