public class Section5x52xMethod_Overloading_Challenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetAndInches = (feet * 12) + inches;
        return convertToCentimeters(feetAndInches);
    }

}


//1 inch = 2.54 cm

// both methods return real / decimal of total height in cm
// call both methods and print results