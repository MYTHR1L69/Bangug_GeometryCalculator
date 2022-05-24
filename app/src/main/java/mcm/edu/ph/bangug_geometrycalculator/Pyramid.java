package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.PyramidCalculator.*;


public class Pyramid extends AppCompatActivity implements View.OnClickListener {

    TextView txtPyramid;
    Button btnPyramidArea, btnPyramidVolume, btnPyramidBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid);

        //xml ID for text view
        txtPyramid = findViewById(R.id.txtPyramid);

        //xml IDs for buttons
        btnPyramidArea = findViewById(R.id.btnPyramidArea);
        btnPyramidVolume = findViewById(R.id.btnPyramidVolume);
        btnPyramidBack = findViewById(R.id.btnPyramidBack);

        //On click listeners for buttons
        btnPyramidArea.setOnClickListener(this);
        btnPyramidVolume.setOnClickListener(this);
        btnPyramidBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnPyramidArea:
                Intent pyramidArea = new Intent(this, PyramidArea.class);
                startActivity(pyramidArea);
                break;
            case R.id.btnPyramidVolume:
                Intent pyramidVolume = new Intent(this, PyramidVolume.class);
                startActivity(pyramidVolume);
                break;
            case R.id.btnPyramidBack:
                Intent pyramidBack = new Intent(this, MainActivity.class);
                startActivity(pyramidBack);
                break;
        }
    }
}