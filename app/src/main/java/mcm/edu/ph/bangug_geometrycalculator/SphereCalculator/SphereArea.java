package mcm.edu.ph.bangug_geometrycalculator.SphereCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.Sphere;
import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.ShapeFormulas;

public class SphereArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtSACalculator, txtSARadius, txtSAAnswer;
    EditText inputSARadius;
    Button btnSACalculate, btnSABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);

        //xml IDs for text views
        txtSACalculator = findViewById(R.id.txtSACalculator);
        txtSARadius = findViewById(R.id.txtSARadius);
        txtSAAnswer = findViewById(R.id.txtSAAnswer);

        //xml IDs for edit texts
        inputSARadius = findViewById(R.id.inputSARadius);

        //xml IDs for buttons
        btnSACalculate = findViewById(R.id.btnSACalculate);
        btnSABack = findViewById(R.id.btnSABack);

        //On click listeners for buttons
        btnSACalculate.setOnClickListener(this);
        btnSABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputSARadius.getText()));

        switch (v.getId()){

            case R.id.btnSACalculate:
                txtSAAnswer.setText("Sphere Area: " +String.valueOf(ShapeFormulas.sphereAreaFormula(radius)));
                break;
            case R.id.btnSABack:
                Intent SABack = new Intent(this, Sphere.class);
                startActivity(SABack);
                break;
        }
    }
}