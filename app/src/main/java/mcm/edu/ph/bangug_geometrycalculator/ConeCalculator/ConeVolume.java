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

    TextView txtCoVCalculator, txtCoVRadius, txtCoVHeight, txtCoVAnswer;
    EditText inputCoVRadius, inputCoVHeight;
    Button btnCoVCalculate, btnCoVBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_volume);

        //xml IDs for text views
        txtCoVCalculator = findViewById(R.id.txtCoVCalculator);
        txtCoVRadius = findViewById(R.id.txtCoVRadius);
        txtCoVHeight = findViewById(R.id.txtCoVHeight);
        txtCoVAnswer = findViewById(R.id.txtCoVAnswer);

        //xml IDs for edit texts
        inputCoVRadius = findViewById(R.id.inputCoVRadius);
        inputCoVHeight = findViewById(R.id.inputCoVHeight);

        //xml IDs for buttons
        btnCoVCalculate = findViewById(R.id.btnCoVCalculate);
        btnCoVBack = findViewById(R.id.btnCoVBack);

        //On click listeners for buttons
        btnCoVCalculate.setOnClickListener(this);
        btnCoVBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        double radius = Double.parseDouble(String.valueOf(inputCoVRadius.getText()));
        double height = Double.parseDouble(String.valueOf(inputCoVHeight.getText()));

        switch (v.getId()){

            case R.id.btnCoVCalculate:
                txtCoVAnswer.setText("Cone Volume: " +String.valueOf(ShapeFormulas.coneVolumeFormula(radius, height)));
                break;
            case R.id.btnCoVBack:
                Intent CoVBack = new Intent(this, Cone.class);
                startActivity(CoVBack);
                break;
        }
    }
}