public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = kilometersPerHour / 1.60934;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
