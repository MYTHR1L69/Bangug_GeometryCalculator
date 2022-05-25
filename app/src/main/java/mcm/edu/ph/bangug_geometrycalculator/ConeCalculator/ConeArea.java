package mcm.edu.ph.bangug_geometrycalculator.ConeCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.Cone;
import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.ShapeFormulas;

public class ConeArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtCoACalculator, txtCoARadius, txtCoAHeight, txtCoAAnswer;
    EditText inputCoARadius, inputCoAHeight;
    Button btnCoACalculate, btnCoABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_area);

        //xml IDs for text views
        txtCoACalculator = findViewById(R.id.txtCoACalculator);
        txtCoARadius = findViewById(R.id.txtCoARadius);
        txtCoAHeight = findViewById(R.id.txtCoAHeight);
        txtCoAAnswer = findViewById(R.id.txtCoAAnswer);

        //xml IDs for edit texts
        inputCoARadius = findViewById(R.id.inputCoARadius);
        inputCoAHeight = findViewById(R.id.inputCoAHeight);

        //xml IDs for buttons
        btnCoACalculate = findViewById(R.id.btnCoACalculate);
        btnCoABack = findViewById(R.id.btnCoABack);

        //On click listeners for buttons
        btnCoACalculate.setOnClickListener(this);
        btnCoABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCoARadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCoAHeight.getText()));

        switch (v.getId()){

            case R.id.btnCoACalculate:
                txtCoAAnswer.setText("Cone Area: " +String.valueOf(ShapeFormulas.coneAreaFormula(radius, height)));
                break;
            case R.id.btnCoABack:
                Intent CoABack = new Intent(this, Cone.class);
                startActivity(CoABack);
                break;
        }
    }
}