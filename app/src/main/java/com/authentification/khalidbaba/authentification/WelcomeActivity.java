package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by khalidbaba on 28/01/2018.
 */

public class WelcomeActivity extends Activity {

    //TODO 6 : Declare all variables (TextView, String)
    TextView Password;
    TextView Email;
    String _email;
    String _password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //TODO 7 : Instantiate all objects

        Email = (TextView) findViewById(R.id.email);
        Password = (TextView) findViewById(R.id.password);

        //TODO 8 : Get the intent content and show the Email in the TextView

        Intent i = getIntent();
        _email = i.getStringExtra("Email");
        _password = i.getStringExtra("Password");

        Email.setText(_email);
        Password.setText(_password);

    }
}
