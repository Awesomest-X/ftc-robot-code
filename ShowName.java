package org.firstinspires.ftc.teamcode.ftc26358;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(group="@Coaches Institute")
public class ShowName extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Programmer", "Vincent");
    }

    @Override
    public void loop() {

    }
}
