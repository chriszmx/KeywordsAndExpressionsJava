public class SwitchChallenge1 {
    public static void main(String[] args) {
        nato('Z');
        nato('z');

//        System.out.println(printDayOfWeek(1));
//        System.out.println(printDayOfWeek(2));
//        System.out.println(printDayOfWeek(3));
//        System.out.println(printDayOfWeek(4));
//        System.out.println(printDayOfWeek(5));
//        System.out.println(printDayOfWeek(6));
//        System.out.println(printDayOfWeek(7));
//        System.out.println(printDayOfWeek(0));

        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printDayOfWeek(0);
    }

    public static void nato(char x) {
        switch (x) {
            case 'A':
                System.out.println("Alpha");
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            case 'F':
                System.out.println("Fox");
                break;
            case 'G':
                System.out.println("George");
                break;
            case 'H':
                System.out.println("How");
                break;
            case 'I':
                System.out.println("Item");
                break;
            case 'J':
                System.out.println("Jig");
                break;
            case 'K':
                System.out.println("King");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'M':
                System.out.println("Mike");
                break;
            case 'N':
                System.out.println("Nan");
                break;
            case 'O':
                System.out.println("Oboe");
                break;
            case 'P':
                System.out.println("Peter");
                break;
            case 'Q':
                System.out.println("Queen");
                break;
            case 'R':
                System.out.println("Roger");
                break;
            case 'S':
                System.out.println("Sugar");
                break;
            case 'T':
                System.out.println("Tare");
                break;
            case 'U':
                System.out.println("Uncle");
                break;
            case 'V':
                System.out.println("Victor");
                break;
            case 'W':
                System.out.println("William");
                break;
            case 'X':
                System.out.println("X-Ray");
                break;
            case 'Y':
                System.out.println("Yoke");
                break;
            case 'Z':
                System.out.println("Zebra");
                break;
            default:
                System.out.println("why so much " + x);
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> day + " is invalid";
        };
        System.out.println( day + " stands for " + dayOfWeek);
    }

}
