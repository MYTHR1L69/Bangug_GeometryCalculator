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

    TextView txtCACalculator, txtCARadius, txtCAHeight, txtCAAnswer;
    EditText inputCARadius, inputCAHeight;
    Button btnCACalculate, btnCABack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_area);

        //xml IDs for text views
        txtCACalculator = findViewById(R.id.txtCACalculator);
        txtCARadius = findViewById(R.id.txtCARadius);
        txtCAHeight = findViewById(R.id.txtCAHeight);
        txtCAAnswer = findViewById(R.id.txtCAAnswer);

        //xml IDs for edit texts
        inputCARadius = findViewById(R.id.inputCARadius);
        inputCAHeight = findViewById(R.id.inputCAHeight);

        //xml IDs for buttons
        btnCACalculate = findViewById(R.id.btnCACalculate);
        btnCABack = findViewById(R.id.btnCABack);

        //On click listeners for buttons
        btnCACalculate.setOnClickListener(this);
        btnCABack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCARadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCAHeight.getText()));

        switch (v.getId()){

            case R.id.btnCACalculate:
                txtCAAnswer.setText("Cone Area: " +String.valueOf(ShapeFormulas.coneAreaFormula(radius, height)));
                break;
            case R.id.btnCABack:
                Intent CABack = new Intent(this, Cone.class);
                startActivity(CABack);
                break;
        }
    }
}