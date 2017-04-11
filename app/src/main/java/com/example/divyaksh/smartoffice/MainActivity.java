package com.example.divyaksh.smartoffice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    private static final int Light1 = 0;
    private static final int Light2 = 1;
    private static final int Fan = 2;
    private static final int Computer = 3;
    private static final int PowerSocket = 4;

    private static final int Office1 = 1;
    private static final int Office2 = 2;

    private static final int ON = 1;
    private static final int OFF = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch switchLight11 = (Switch) findViewById(R.id.switch_light_1_1);
        final Switch switchLight21 = (Switch) findViewById(R.id.switch_light_2_1);
        final Switch switchFan1 = (Switch) findViewById(R.id.switch_fan_1);
        final Switch switchComputer1 = (Switch) findViewById(R.id.switch_computer_1);
        final Switch switchPower1 = (Switch) findViewById(R.id.switch_power_1);

        final Switch switchLight12 = (Switch) findViewById(R.id.switch_light_1_2);
        final Switch switchLight22 = (Switch) findViewById(R.id.switch_light_2_2);
        final Switch switchFan2 = (Switch) findViewById(R.id.switch_fan_2);
        final Switch switchComputer2 = (Switch) findViewById(R.id.switch_computer_2);
        final Switch switchPower2 = (Switch) findViewById(R.id.switch_power_2);

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


        //For office 2
        switchLight12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office2, Light1, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office2, Light1, OFF);
                    request.start();
                }
            }
        });

        switchLight22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office2, Light2, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office2, Light2, OFF);
                    request.start();
                }
            }
        });

        switchFan2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office2, Fan, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office2, Fan, OFF);
                    request.start();
                }
            }
        });

        switchComputer2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office2, Computer, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office2, Computer, OFF);
                    request.start();
                }
            }
        });

        switchPower2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {

                if(!checked) {
                    SendRequest request = new SendRequest(Office2, PowerSocket, ON);
                    request.start();
                }
                else {
                    SendRequest request = new SendRequest(Office2, PowerSocket, OFF);
                    request.start();
                }
            }
        });
    }


}
