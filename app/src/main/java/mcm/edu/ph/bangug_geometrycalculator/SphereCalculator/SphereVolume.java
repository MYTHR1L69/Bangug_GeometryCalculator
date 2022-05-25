package mcm.edu.ph.bangug_geometrycalculator.SphereCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.ShapeFormulas;
import mcm.edu.ph.bangug_geometrycalculator.Sphere;

public class SphereVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtSVCalculator, txtSVRadius, txtSVAnswer;
    EditText inputSVRadius;
    Button btnSVCalculate, btnSVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);

        //xml IDs for text views
        txtSVCalculator = findViewById(R.id.txtSVCalculator);
        txtSVRadius = findViewById(R.id.txtSVRadius);
        txtSVAnswer = findViewById(R.id.txtSVAnswer);

        //xml IDs for edit texts
        inputSVRadius = findViewById(R.id.inputSVRadius);

        //xml IDs for buttons
        btnSVCalculate = findViewById(R.id.btnSVCalculate);
        btnSVBack = findViewById(R.id.btnSVBack);

        //On click listeners for buttons
        btnSVCalculate.setOnClickListener(this);
        btnSVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputSVRadius.getText()));

        switch (v.getId()){

            case R.id.btnSVCalculate:
                txtSVAnswer.setText("Sphere Area: " +String.valueOf(ShapeFormulas.sphereVolumeFormula(radius)));
                break;
            case R.id.btnSVBack:
                Intent SVBack = new Intent(this, Sphere.class);
                startActivity(SVBack);
                break;
        }
    }
}