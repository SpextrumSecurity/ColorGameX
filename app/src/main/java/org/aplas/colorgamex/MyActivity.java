package org.aplas.colorgamex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.Toast;


public class MyActivity extends AppCompatActivity {
    private TextView timer;
    private TextView clrText;
    private TextView scoreText;
    private EditText passwd;
    private Button submit;
    private Button start;
    private ViewGroup accessbox;
    private ViewGroup colorbox;
    private ViewGroup buttonbox1;
    private ViewGroup buttonbox2;
    private ViewGroup scorebox;
    private ViewGroup progressbox;
    private ProgressBar progress;
    private Switch isMinus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        timer = (TextView) findViewById(R.id.timerText);
        clrText = (TextView) findViewById(R.id.clrText);
        scoreText = (TextView) findViewById(R.id.scoreText);
        passwd = (EditText) findViewById(R.id.appCode);
        submit = (Button) findViewById(R.id.submitBtn);
        start = (Button) findViewById(R.id.startBtn);
        accessbox = (ViewGroup) findViewById(R.id.accessBox);
        colorbox = (ViewGroup) findViewById(R.id.colorBox);
        buttonbox1 = (ViewGroup) findViewById(R.id.buttonBox1);
        buttonbox2 = (ViewGroup) findViewById(R.id.buttonBox2);
        scorebox = (ViewGroup) findViewById(R.id.scoreBox);
        progressbox = (ViewGroup) findViewById(R.id.progressBox);
        progress = (ProgressBar) findViewById(R.id.progressScore);
        isMinus = (Switch) findViewById(R.id.isMinus);

    }
    public void openGame(View V){
        String keyword = getString(R.string.keyword);
        String pass = passwd.getText().toString();
        if (!pass.equals(keyword)){
            Toast.makeText(getApplicationContext(), "Password is wrong",
                    Toast.LENGTH_LONG).show();
        } else {
            passwd.setVisibility(View.INVISIBLE);
            submit.setVisibility(View.INVISIBLE);
            accessbox.setVisibility(View.VISIBLE);
            colorbox.setVisibility(View.VISIBLE);
            buttonbox1.setVisibility(View.VISIBLE);
            buttonbox2.setVisibility(View.VISIBLE);
            scorebox.setVisibility(View.VISIBLE);
            progressbox.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), "Login Success",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void startGame(View V){

    }
    public void submitColor(View V){

    }
}