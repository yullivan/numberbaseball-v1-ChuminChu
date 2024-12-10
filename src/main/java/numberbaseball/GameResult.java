package numberbaseball;

public class GameResult {
    int strikesCount;
    int ballCount;

    //생성자
    public GameResult(int strikesCount, int ballCount) {
        this.strikesCount = strikesCount;
        this.ballCount = ballCount;
    }

    public BallResult incrementCount(BallResult result){


        if(result == BallResult.STRIKE){
            strikesCount = strikesCount + 1;
        } else if (result == BallResult.BALL) {
            ballCount += 1;
        }
        return BallResult.NOTHING;
    }

    public boolean isGameOver(){
        if(strikesCount == 3){
            return true;
        }
        return false;
    }


}



