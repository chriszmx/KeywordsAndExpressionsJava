public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945)); //first test case
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds) {
//        int minutes = seconds /60;
//        int hours = minutes /60;
////        System.out.println("hours = " + hours);
//
//        int remainingMinutes = minutes % 60;
////        System.out.println("minutes = " + minutes);
////        System.out.println("remainingMinutes = " + remainingMinutes);
//
//        int remainingSeconds = seconds % 60;
////        System.out.println("remainingSeconds = " + remainingSeconds);
//
//        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

}


// 1 60 3600


// first method seconds parameter should be >= 0

//second method min parameter should be >= 0
// sec parameter should be >=0 and <=59