package com.example.telephony_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView output;
Button get_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        get_data = findViewById(R.id.get_data);

        get_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
                Toast.makeText(MainActivity.this, "Entered in button listener", Toast.LENGTH_SHORT).show();
                // calling the methods of telephony manager to return the information
//                String IMEINumber= tm.getDeviceId();
 //               String SIMSerialNumber = tm.getSimSerialNumber();
//                String softwareVersion = tm.getDeviceSoftwareVersion();
 //               String voiceMailNumber = tm.getVoiceMailNumber();
                int nwType = tm.getDataNetworkType();
                Toast.makeText(MainActivity.this, "Methods passed", Toast.LENGTH_SHORT).show();

                // Get the phone type
                int phoneType = tm.getPhoneType();
                String strphoneType ="" ;
                switch (phoneType)
                {
                    case (TelephonyManager.PHONE_TYPE_CDMA):
                        strphoneType = "CDMA";
                        break;
                    case (TelephonyManager.PHONE_TYPE_GSM):
                        strphoneType = "GSM";
                        break;
                    case (TelephonyManager.PHONE_TYPE_SIP):
                        strphoneType = "SIP";
                        break;
                    case (TelephonyManager.PHONE_TYPE_NONE):

                        break;
                }
                Toast.makeText(MainActivity.this, "After switch statement", Toast.LENGTH_SHORT).show();
                //getting the information if phone is in roaming
                boolean isRoaming = tm.isNetworkRoaming();
                String info = "Phone Details: \n";
//               info +=" \n IMEI Number : " + IMEINumber;
//                info +=" \n Sim Serial Number : " + SIMSerialNumber;
//                info +=" \n Software Version : " + softwareVersion;
//                info +=" \n voice Mail Number : " + voiceMailNumber;
               info +=" \n Phone Network type : " + strphoneType;
//                info +=" \n Data Network Type : " + nwType;

            output.setText(info);// display the data


            }
        });
    }
}