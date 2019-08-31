package com.example.admin.example;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button  button = null;
    TextView textView = null;
    EditText editText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.textView5);
        editText = (EditText) findViewById(R.id.editText4);
        final String name = editText.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            textView.setText("Hello "+name+"\nWelcome to JavaTutorial");
            }
        });
    }
}