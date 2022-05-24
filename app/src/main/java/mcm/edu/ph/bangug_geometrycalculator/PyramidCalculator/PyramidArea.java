package mcm.edu.ph.bangug_geometrycalculator.PyramidCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.bangug_geometrycalculator.Pyramid;
import mcm.edu.ph.bangug_geometrycalculator.R;
import mcm.edu.ph.bangug_geometrycalculator.*;

public class PyramidArea extends AppCompatActivity implements View.OnClickListener {

    TextView txtPACalculator, txtPALength, txtPAWidth, txtPAHeight, txtPAAnswer;
    EditText inputPALength, inputPAWidth, inputPAHeight;
    Button btnPACalculate, btnPABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramid_area);

        //xml IDs for text views
        txtPACalculator = findViewById(R.id.txtPACalculator);
        txtPALength = findViewById(R.id.txtPALength);
        txtPAWidth = findViewById(R.id.txtPAWidth);
        txtPAHeight = findViewById(R.id.txtPAHeight);
        txtPAAnswer = findViewById(R.id.txtPAAnswer);

        //xml IDs for edit texts
        inputPALength = findViewById(R.id.inputPALength);
        inputPAWidth = findViewById(R.id.inputPAWidth);
        inputPAHeight = findViewById(R.id.inputPAHeight);

        //xml IDs for buttons
        btnPACalculate = findViewById(R.id.btnPACalculate);
        btnPABack = findViewById(R.id.btnPABack);

        //On click listeners for buttons
        btnPACalculate.setOnClickListener(this);
        btnPABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double length = Double.parseDouble(String.valueOf(inputPALength.getText()));
        double width = Double.parseDouble(String.valueOf(inputPAWidth.getText()));
        double height = Double.parseDouble(String.valueOf(inputPAHeight.getText()));

        switch (v.getId()){

            case R.id.btnPACalculate:
                txtPAAnswer.setText("Pyramid Area: " +String.valueOf(ShapeFormulas.pyramidAreaFormula(length,width,height)));
                break;
            case R.id.btnPABack:
                Intent PABack = new Intent(this, Pyramid.class);
                startActivity(PABack);
                break;
        }
    }
}