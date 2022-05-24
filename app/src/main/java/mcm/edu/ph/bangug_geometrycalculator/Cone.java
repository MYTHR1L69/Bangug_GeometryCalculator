package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.ConeCalculator.*;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    TextView txtCone;
    Button btnConeArea, btnConeVolume, btnConeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        //xml ID for text view
        txtCone = findViewById(R.id.txtCone);

        //xml IDs for buttons
        btnConeArea = findViewById(R.id.btnConeArea);
        btnConeVolume = findViewById(R.id.btnConeVolume);
        btnConeBack = findViewById(R.id.btnConeBack);

        //On click listeners for buttons
        btnConeArea.setOnClickListener(this);
        btnConeVolume.setOnClickListener(this);
        btnConeBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnConeArea:
                Intent ConeArea = new Intent(this, ConeArea.class);
                startActivity(ConeArea);
                break;
            case R.id.btnConeVolume:
                Intent ConeVolume = new Intent(this, ConeVolume.class);
                startActivity(ConeVolume);
                break;
            case R.id.btnConeBack:
                Intent ConeBack = new Intent(this, MainActivity.class);
                startActivity(ConeBack);
                break;
        }
    }
}