package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button sendButton;
TextView nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText) ;
        sendButton = (Button)findViewById(R.id.button) ;
        nameView = (TextView)findViewById(R.id.textView) ;
    }


    public void onClick(View v){
    String name =  editText.getText().toString();
        nameView.setText("Hello "+ name);

    }
}
