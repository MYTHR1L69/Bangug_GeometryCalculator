package mcm.edu.ph.bangug_geometrycalculator.CubeCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.Cube;
import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.ShapeFormulas;

public class CubeArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtCuACalculator, txtCuAEdge, txtCuAAnswer;
    EditText inputCuAEdge;
    Button btnCuACalculate, btnCuABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_area);

        //xml IDs for text views
        txtCuACalculator = findViewById(R.id.txtCuACalculator);
        txtCuAEdge = findViewById(R.id.txtCuAEdge);
        txtCuAAnswer = findViewById(R.id.txtCuAAnswer);

        //xml IDs for edit texts
        inputCuAEdge = findViewById(R.id.inputCuAEdge);

        //xml IDs for buttons
        btnCuACalculate = findViewById(R.id.btnCuACalculate);
        btnCuABack = findViewById(R.id.btnCuABack);

        //On click listeners for buttons
        btnCuACalculate.setOnClickListener(this);
        btnCuABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(inputCuAEdge.getText()));

        switch (v.getId()){

            case R.id.btnCuACalculate:
                txtCuAAnswer.setText("Cube Area: " +String.valueOf(ShapeFormulas.cubeAreaFormula(edge)));
                break;
            case R.id.btnCuABack:
                Intent CuABack = new Intent(this, Cube.class);
                startActivity(CuABack);
                break;
        }
    }
}