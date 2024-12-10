package numberbaseball;

import java.util.List;

public class Balls {
    List<Ball> values;

    public Balls(List<Ball> values) {
        this.values = values;
    }

    public BallResult ballsMatchStatus(Ball otherBall) {

        BallResult result;
        for (Ball value : values) {
            result = otherBall.matchStatus(value);
            if (result.equals(BallResult.STRIKE)) {
                //return "STRIKE";
                return BallResult.STRIKE;
            }
            if (result.equals(BallResult.BALL)) {
                //return "BALL";
                return BallResult.BALL;
            }
        }
        //return "NOTHING";
        return BallResult.NOTHING;
            /*
            if(value.position == otherBall.position &&
            value.number == otherBall.number){
                return "STRIKE";
            }
            if (value.number == otherBall.number ){
                return "BALL";
            }
        }
        return "NOTHING";
    }
             */
    }

    public GameResult ballsBallsMatchStatus(Balls otherBalls) {
        //2. incremnetCount에 대상자를 줄 오브젝트를 만든다.
        GameResult gameResult = new GameResult(0, 0);
        BallResult result;
        for (Ball value : values) {
             result = otherBalls.ballsMatchStatus(value);
             //1. 나는 result를 incrementCount 얘한테 주고 싶은데 줄 대상자가 없는거다. 따라서 대상자를 만들고 싶다. -> 2로
             gameResult.incrementCount(result);
             //3. 오브젝트가 있기 때문에 incrementCount에 줄 수 있는 것
        }
        return gameResult;
    }




}
