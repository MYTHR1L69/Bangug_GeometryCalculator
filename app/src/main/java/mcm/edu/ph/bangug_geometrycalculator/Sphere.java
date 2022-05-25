package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import mcm.edu.ph.bangug_geometrycalculator.SphereCalculator.*;

public class Sphere extends AppCompatActivity implements View.OnClickListener {

    TextView txtSphere;
    Button btnSphereArea, btnSphereVolume, btnSphereBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        //xml ID for text view
        txtSphere = findViewById(R.id.txtSphere);

        //xml IDs for buttons
        btnSphereArea = findViewById(R.id.btnSphereArea);
        btnSphereVolume = findViewById(R.id.btnSphereVolume);
        btnSphereBack = findViewById(R.id.btnSphereBack);

        //On click listeners for buttons
        btnSphereArea.setOnClickListener(this);
        btnSphereVolume.setOnClickListener(this);
        btnSphereBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnSphereArea:
                Intent sphereArea = new Intent(this, SphereArea.class);
                startActivity(sphereArea);
                break;
            case R.id.btnSphereVolume:
                Intent sphereVolume = new Intent(this, SphereVolume.class);
                startActivity(sphereVolume);
                break;
            case R.id.btnSphereBack:
                Intent sphereBack = new Intent(this, MainActivity.class);
                startActivity(sphereBack);
                break;
        }
    }
}