package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.CubeCalculator.*;

public class Cube extends AppCompatActivity implements View.OnClickListener {

    TextView txtCube;
    Button btnCubeArea, btnCubeVolume, btnCubeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        //xml ID for text view
        txtCube = findViewById(R.id.txtCube);

        //xml IDs for buttons
        btnCubeArea = findViewById(R.id.btnCubeArea);
        btnCubeVolume = findViewById(R.id.btnCubeVolume);
        btnCubeBack = findViewById(R.id.btnCubeBack);

        //On click listeners for buttons
        btnCubeArea.setOnClickListener(this);
        btnCubeVolume.setOnClickListener(this);
        btnCubeBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnCubeArea:
                Intent cubeArea = new Intent(this, CubeArea.class);
                startActivity(cubeArea);
                break;
            case R.id.btnCubeVolume:
                Intent cubeVolume = new Intent(this, CubeVolume.class);
                startActivity(cubeVolume);
                break;
            case R.id.btnCubeBack:
                Intent cubeBack = new Intent(this, MainActivity.class);
                startActivity(cubeBack);
                break;
        }
    }
}