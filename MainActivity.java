package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edittext;
Button btn,clr;
TextView WelcomTxt,Rslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = findViewById(R.id.edittext);
        btn = findViewById(R.id.button);
        Rslt = findViewById(R.id.textView2);
        clr = findViewById(R.id.clr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rslt.setText(null);
                edittext.setText(null);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double entered_kilos = Double.parseDouble(edittext.getText().toString());
                Rslt.setText("  "+convert_to_kilos(entered_kilos)+" "+"Pounds");
                Rslt.onEditorAction(EditorInfo.IME_ACTION_DONE);
            }
        });


    }

    public double convert_to_kilos(double kilos)
    {
        double Rslt_kilos= kilos*2.20462;
        return Rslt_kilos;
    }
}
