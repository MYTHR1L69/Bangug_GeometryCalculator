package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.CylinderCalculator.*;

public class Cylinder extends AppCompatActivity implements View.OnClickListener {

    TextView txtCylinder;
    Button btnCylinderArea, btnCylinderVolume, btnCylinderBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        //xml ID for text view
        txtCylinder = findViewById(R.id.txtCylinder);

        //xml IDs for buttons
        btnCylinderArea = findViewById(R.id.btnCylinderArea);
        btnCylinderVolume = findViewById(R.id.btnCylinderVolume);
        btnCylinderBack = findViewById(R.id.btnCylinderBack);

        //On click listeners for buttons
        btnCylinderArea.setOnClickListener(this);
        btnCylinderVolume.setOnClickListener(this);
        btnCylinderBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnCylinderArea:
                Intent cylinderArea = new Intent(this, CylinderArea.class);
                startActivity(cylinderArea);
                break;
            case R.id.btnCylinderVolume:
                Intent cylinderVolume = new Intent(this, CylinderVolume.class);
                startActivity(cylinderVolume);
                break;
            case R.id.btnCylinderBack:
                Intent cylinderBack = new Intent(this, MainActivity.class);
                startActivity(cylinderBack);
                break;
        }
    }
}