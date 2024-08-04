package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group="@Coaches Institute")
public class ShowGamepad extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Programmer", "Vincent");
    }

    @Override
    public void loop() {
        telemetry.addData("l_y", gamepad1.left_stick_y);
        telemetry.addData("l_x", gamepad1.left_stick_x);
        telemetry.addData("r_y", gamepad1.right_stick_y);
        telemetry.addData("r_x", gamepad1.right_stick_x);

    }
}
