package com.example.beknazar.mytwoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

 Button btnActTwo;
 Button btnActThree;
 Button btnActFour;
 Button btnActFive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo=(Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActThree=(Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
        btnActFour=(Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);
        btnActFive=(Button) findViewById(R.id.btnActFive);
        btnActFive.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnActTwo:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intent2 = new Intent(this, Main3Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnActFour:
                Intent intent3 = new Intent(this, Main4Activity.class);
                startActivity(intent3);
                break;
            case R.id.btnActFive:
                Intent intent4 = new Intent(this, Main5Activity.class);
                startActivity(intent4);
                break;
            default:
                break;

        }
    }
}
