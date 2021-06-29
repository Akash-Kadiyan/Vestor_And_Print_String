package com.example.scriptapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText PutText;
    Button btn;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PutText=findViewById(R.id.PutText);
        btn=findViewById(R.id.btn);
        Result=findViewById(R.id.result);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Str=PutText.getText().toString().trim();
                if(!Str.isEmpty()) {
                    Result.setText(Str);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Input field cannot be empty", Toast.LENGTH_SHORT).show();
                    Result.setText("");
                }

            }


        });
    }
}