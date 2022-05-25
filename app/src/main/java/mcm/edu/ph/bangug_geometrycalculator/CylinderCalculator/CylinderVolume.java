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

public class CylinderVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtCyVCalculator, txtCyVRadius, txtCyVHeight, txtCyVAnswer;
    EditText inputCyVRadius, inputCyVHeight;
    Button btnCyVCalculate, btnCyVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);

        //xml IDs for text views
        txtCyVCalculator = findViewById(R.id.txtCyVCalculator);
        txtCyVRadius = findViewById(R.id.txtCyVRadius);
        txtCyVHeight = findViewById(R.id.txtCyVHeight);
        txtCyVAnswer = findViewById(R.id.txtCyVAnswer);

        //xml IDs for edit texts
        inputCyVRadius = findViewById(R.id.inputCyVRadius);
        inputCyVHeight = findViewById(R.id.inputCyVHeight);

        //xml IDs for buttons
        btnCyVCalculate = findViewById(R.id.btnCyVCalculate);
        btnCyVBack = findViewById(R.id.btnCyVBack);

        //On click listeners for buttons
        btnCyVCalculate.setOnClickListener(this);
        btnCyVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCyVRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCyVHeight.getText()));

        switch (v.getId()){

            case R.id.btnCyVCalculate:
                txtCyVAnswer.setText("Cylinder Area: " +String.valueOf(ShapeFormulas.cylinderVolumeFormula(radius, height)));
                break;
            case R.id.btnCyVBack:
                Intent CyVBack = new Intent(this, Cylinder.class);
                startActivity(CyVBack);
                break;
        }
    }
}