package ThucHanh3;

public class Cylinder {
//    public static double getVolume(int radius, int height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
//    }


    //Sau khi tách phương thức
    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        return height * perimeter + 2 * baseArea;
    }
}
