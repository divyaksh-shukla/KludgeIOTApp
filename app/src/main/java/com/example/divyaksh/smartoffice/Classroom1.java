package com.example.divyaksh.smartoffice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Classroom1 extends AppCompatActivity {

    private static final int Light1 = 0;
    private static final int Light2 = 1;
    private static final int Fan = 2;
    private static final int Computer = 3;
    private static final int PowerSocket = 4;

    private static final int Office1 = 1;

    private static final int ON = 1;
    private static final int OFF = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom1);

        final Switch switchLight11 = (Switch) findViewById(R.id.switch_light_1_1);
        final Switch switchLight21 = (Switch) findViewById(R.id.switch_light_2_1);
        final Switch switchFan1 = (Switch) findViewById(R.id.switch_fan_1);
        final Switch switchComputer1 = (Switch) findViewById(R.id.switch_computer_1);
        final Switch switchPower1 = (Switch) findViewById(R.id.switch_power_1);

        switchLight11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office1, Light1, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office1, Light1, OFF);
                    request.start();
                }
            }
        });

        switchLight21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office1, Light2, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office1, Light2, OFF);
                    request.start();
                }
            }
        });

        switchFan1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office1, Fan, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office1, Fan, OFF);
                    request.start();
                }
            }
        });

        switchComputer1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office1, Computer, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office1, Computer, OFF);
                    request.start();
                }
            }
        });

        switchPower1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office1, PowerSocket, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office1, PowerSocket, OFF);
                    request.start();
                }
            }
        });
    }
}
