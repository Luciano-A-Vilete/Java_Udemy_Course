public class Method {
    public static void main(String[] args) {
       int HighScore =  CalculateScore(true, 156_418, 93, 111);
       System.out.print("Your HighScore is: " + HighScore);
    }

    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
        } return finalScore;
    }
}

