package BaiTap1;

public class TennisGame {

//    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
//        String score = "";
//        int tempScore = 0;
//        if (m_score1 == m_score2) {
//            switch (m_score1) {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//
//            }
//        } else if (m_score1 >= 4 || m_score2 >= 4) {
//            int minusResult = m_score1 - m_score2;
//            if (minusResult == 1) score = "Advantage player1";
//            else if (minusResult == -1) score = "Advantage player2";
//            else if (minusResult >= 2) score = "Win for player1";
//            else score = "Win for player2";
//        } else {
//            for (int i = 1; i < 3; i++) {
//                if (i == 1) tempScore = m_score1;
//                else {
//                    score += "-";
//                    tempScore = m_score2;
//                }
//                switch (tempScore) {
//                    case 0:
//                        score += "Love";
//                        break;
//                    case 1:
//                        score += "Fifteen";
//                        break;
//                    case 2:
//                        score += "Thirty";
//                        break;
//                    case 3:
//                        score += "Forty";
//                        break;
//                }
//            }
//        }
//        return score;
//    }


//sau khi clean code

    public static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};
    public static final char LOVE = 0;
    public static final char FIFTEEN = 1;
    public static final char THIRTY = 2;
    public static final char FORTY = 3;
    public static final int SCORE_CHECK_MATE = 4;

    public static boolean isWin(int score1, int score2) {
        return Math.abs(score1 - score2) == 2;
    }

    public static String getResult(String player1, String player2, int score1, int score2) {
        String result = "";
        if (score1 == score2) {
            if (score1 > FORTY) {
                result = "Deuce";
            } else {
                result = SCORE_NAMES[score1] + "-All";
            }
        } else if (score1 >= SCORE_CHECK_MATE || score2 >= SCORE_CHECK_MATE) {
            result = "Advantage: ";

            if (isWin(score1, score2)) {
                result = "Win: ";
            }

            result += (score1 > score2) ? player1 : player2;
        } else {
            result = SCORE_NAMES[score1] + "-" + SCORE_NAMES[score2];
        }
        return result;
    }
}