package mcm.edu.ph.bangug_geometrycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtHeading;
    Button btnPyramid, btnCone, btnCylinder, btnCube, btnSphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml ID for text view
        txtHeading = findViewById(R.id.txtHeading);

        //xml IDs for buttons
        btnPyramid = findViewById(R.id.btnPyramid);
        btnCone = findViewById(R.id.btnCone);
        btnCylinder = findViewById(R.id.btnCylinder);
        btnCube = findViewById(R.id.btnCube);
        btnSphere = findViewById(R.id.btnSphere);

        //On click listeners for buttons
        btnPyramid.setOnClickListener(this);
        btnCone.setOnClickListener(this);
        btnCylinder.setOnClickListener(this);
        btnCube.setOnClickListener(this);
        btnSphere.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){

            case R.id.btnPyramid:
                Intent Pyramid = new Intent(this, Pyramid.class);
                startActivity(Pyramid);
                break;
            case R.id.btnCone:
                Intent Cone = new Intent(this, Cone.class);
                startActivity(Cone);
                break;
            case R.id.btnCylinder:
                Intent Cylinder = new Intent(this, Cylinder.class);
                startActivity(Cylinder);
                break;
            case R.id.btnCube:
                Intent Cube = new Intent(this, Cube.class);
                startActivity(Cube);
                break;
            case R.id.btnSphere:
                Intent Sphere = new Intent(this,Sphere.class);
                startActivity(Sphere);
                break;
        }
    }
}