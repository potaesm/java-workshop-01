public class TennisGame2 implements TennisGame {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] result = {"Love", "Fifteen", "Thirty", "Forty"};
        String score = "";
        if (player1Point == player2Point) {
            score = (player1Point >= 3) ? "Deuce" : result[player1Point] + "-All";
        } else if (player1Point <= 3 && player2Point <= 3) {
            score = result[player1Point] + "-" + result[player2Point];
        } else {
            if (player1Point > player2Point) {
                score = ((player1Point - player2Point) >= 2) ? "Win for " + this.player1Name : "Advantage " + this.player1Name;
            } else {
                score = ((player2Point - player1Point) >= 2) ? "Win for " + this.player2Name : "Advantage " + this.player2Name;
            }
        }
        return score;
    }

    public void player1Score() {
        player1Point++;
    }

    public void player2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player)) {
            player1Score();
        } else {
            player2Score();
        }
    }
}
