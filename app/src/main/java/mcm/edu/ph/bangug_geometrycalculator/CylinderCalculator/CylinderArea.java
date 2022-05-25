package mcm.edu.ph.bangug_geometrycalculator.CylinderCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.Cylinder;
import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.ShapeFormulas;

public class CylinderArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtCyACalculator, txtCyARadius, txtCyAHeight, txtCyAAnswer;
    EditText inputCyARadius, inputCyAHeight;
    Button btnCyACalculate, btnCyABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_area);

        //xml IDs for text views
        txtCyACalculator = findViewById(R.id.txtCyACalculator);
        txtCyARadius = findViewById(R.id.txtCyARadius);
        txtCyAHeight = findViewById(R.id.txtCyAHeight);
        txtCyAAnswer = findViewById(R.id.txtCyAAnswer);

        //xml IDs for edit texts
        inputCyARadius = findViewById(R.id.inputCyARadius);
        inputCyAHeight = findViewById(R.id.inputCyAHeight);

        //xml IDs for buttons
        btnCyACalculate = findViewById(R.id.btnCyACalculate);
        btnCyABack = findViewById(R.id.btnCyABack);

        //On click listeners for buttons
        btnCyACalculate.setOnClickListener(this);
        btnCyABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCyARadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCyAHeight.getText()));

        switch (v.getId()){

            case R.id.btnCyACalculate:
                txtCyAAnswer.setText("Cylinder Area: " +String.valueOf(ShapeFormulas.cylinderAreaFormula(radius, height)));
                break;
            case R.id.btnCyABack:
                Intent CyABack = new Intent(this, Cylinder.class);
                startActivity(CyABack);
                break;
        }
    }
}