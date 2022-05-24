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

public class ConeVolume extends AppCompatActivity implements View.OnClickListener {

    TextView txtCVCalculator, txtCVRadius, txtCVHeight, txtCVAnswer;
    EditText inputCVRadius, inputCVHeight;
    Button btnCVCalculate, btnCVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_volume);

        //xml IDs for text views
        txtCVCalculator = findViewById(R.id.txtCVCalculator);
        txtCVRadius = findViewById(R.id.txtCVRadius);
        txtCVHeight = findViewById(R.id.txtCVHeight);
        txtCVAnswer = findViewById(R.id.txtCVAnswer);

        //xml IDs for edit texts
        inputCVRadius = findViewById(R.id.inputCVRadius);
        inputCVHeight = findViewById(R.id.inputCVHeight);

        //xml IDs for buttons
        btnCVCalculate = findViewById(R.id.btnCVCalculate);
        btnCVBack = findViewById(R.id.btnCVBack);

        //On click listeners for buttons
        btnCVCalculate.setOnClickListener(this);
        btnCVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCVRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCVHeight.getText()));

        switch (v.getId()){

            case R.id.btnCVCalculate:
                txtCVAnswer.setText("Cone Volume: " +String.valueOf(ShapeFormulas.coneVolumeFormula(radius, height)));
                break;
            case R.id.btnCVBack:
                Intent CVBack = new Intent(this, Cone.class);
                startActivity(CVBack);
                break;
        }
    }
}