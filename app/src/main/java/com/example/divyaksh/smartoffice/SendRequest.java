package com.example.divyaksh.smartoffice;

import android.content.ComponentName;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by divyaksh on 11/4/17.
 */

public class SendRequest extends Thread{

    private static final String TAG = SendRequest.class.getName();

    private int officeNumber;
    private int field;
    private int value;

    private static final String BASE_URL = "https://api.thingspeak.com/update?api_key=";
    private static final String API_KEY_1 = "HLK4HZQ4CHAO5J2V";
    private static final String API_KEY_2 = "P60UH6VT23RW9V2Q";

    private static final String fieldName[] = {"field1" , "field2" , "field3" , "field4" , "field5"};

    public SendRequest (int officeNumber, int field, int value) {
        this.officeNumber = officeNumber;
        this.field = field;
        this.value = value;
    }

    public void run() {

        HttpsURLConnection connection = null;

        //Framing the URL
        String urlString = BASE_URL;

        if (officeNumber == 1) {
            urlString += API_KEY_1;
        }
        else {
            urlString += API_KEY_2;
        }

        urlString += "&";
        urlString += fieldName[field];
        urlString += "=";
        urlString += value;

        Log.d(TAG, "URL Framed...");

        //Creating the URL
        try {
            URL url = new URL(urlString);
            Log.d(TAG, "Url Created... - " + urlString);

            connection = (HttpsURLConnection) url.openConnection();
            Log.d(TAG, "Connection Opened...");

            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            Log.d(TAG, "HTTPS Connection made...");

            if (responseCode == HttpsURLConnection.HTTP_OK) {
                Log.d(TAG, "Http Connection OK...");
            }
            else {
                Log.d(TAG, "Http Connection FAILED!!!");
            }

        } catch (MalformedURLException e) {
            Log.d(TAG, e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
                Log.d(TAG, "Connection Released...");
            }
        }
    }

}
