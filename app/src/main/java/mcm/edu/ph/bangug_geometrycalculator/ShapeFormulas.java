package mcm.edu.ph.bangug_geometrycalculator;

import java.lang.Math;

public class ShapeFormulas {

    public static double pyramidAreaFormula(double length, double width, double height){
        //return
        return (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));
    }

    public static double pyramidVolumeFormula(double length, double width, double height){
        return (length * width * height) / 3;
    }

    public static double coneAreaFormula(double radius, double height){
        return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    public static double coneVolumeFormula(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}
