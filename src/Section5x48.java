public class Section5x48 {
    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dex", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Oliver", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Hunter", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Cosima", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Twitch", highScorePosition);

    }

    // method 1
    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName +
                " managed to get into position " +
                playersPosition +
                " on the high score list!");

    }

    // method 2
    public static int calculateHighScorePosition(int playersScore) {
        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;
    }

}
