public class MethodChalenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Luciano",highScorePosition);


    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.print(playerName + " managed to get into position " + highScorePosition + "º on the High Score List");

    }
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            return position = 1;
        } else if (playerScore >= 500 && playerScore <= 1000) {
            return position = 2;
        } else if (playerScore >= 100 && playerScore <= 500) {
            return position = 3;
        } return position;
        }
    }
