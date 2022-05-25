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

public class CubeVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtCuVCalculator, txtCuVEdge, txtCuVAnswer;
    EditText inputCuVEdge;
    Button btnCuVCalculate, btnCuVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_volume);

        //xml IDs for text views
        txtCuVCalculator = findViewById(R.id.txtCuVCalculator);
        txtCuVEdge = findViewById(R.id.txtCuVEdge);
        txtCuVAnswer = findViewById(R.id.txtCuVAnswer);

        //xml IDs for edit texts
        inputCuVEdge = findViewById(R.id.inputCuVEdge);

        //xml IDs for buttons
        btnCuVCalculate = findViewById(R.id.btnCuVCalculate);
        btnCuVBack = findViewById(R.id.btnCuVBack);

        //On click listeners for buttons
        btnCuVCalculate.setOnClickListener(this);
        btnCuVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double edge = Double.parseDouble(String.valueOf(inputCuVEdge.getText()));

        switch (v.getId()){

            case R.id.btnCuVCalculate:
                txtCuVAnswer.setText("Cube Area: " +String.valueOf(ShapeFormulas.cubeVolumeFormula(edge)));
                break;
            case R.id.btnCuVBack:
                Intent CuVBack = new Intent(this, Cube.class);
                startActivity(CuVBack);
                break;
        }
    }
}