package mcm.edu.ph.bangug_geometrycalculator;

import java.lang.Math;

public class ShapeFormulas {

    public static double pyramidAreaFormula(double length, double width, double height){
        return (length * width) + (length * Math.sqrt(Math.pow(width / 2.0, 2.0) + Math.pow(height, 2.0))) + (width * Math.sqrt(Math.pow(length / 2.0, 2.0) + Math.pow(height, 2.0)));
    }

    public static double pyramidVolumeFormula(double length, double width, double height){
        return (length * width * height) / 3.0;
    }

    public static double coneAreaFormula(double radius, double height){
        return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
    }

    public static double coneVolumeFormula(double radius, double height){
        return Math.PI * Math.pow(radius, 2.0) * (height / 3.0);
    }

    public static double cylinderAreaFormula(double radius, double height){
        return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2.0));
    }

    public static double cylinderVolumeFormula(double radius, double height){
        return (Math.PI * Math.pow(radius, 2.0) * height);
    }

    public static double cubeAreaFormula(double edge){
        return 6.0 * Math.pow(edge, 2.0);
    }

    public static double cubeVolumeFormula(double edge){
        return Math.pow(edge, 3.0);
    }

    public static double sphereAreaFormula(double radius){
        return 4.0 * Math.PI * Math.pow(radius, 2.0);
    }

    public static double sphereVolumeFormula(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }
}
