package numberbaseball;

import java.util.Objects;

public class Ball {
    //자리
    int position;
    //수
    int number;


    public Ball(int number, int position) {
        this.position = position;
        this.number = number;

    }


    //input : user 공 / output : String으로 스트라이크를 출력
    //함수는 user 공을 줄테니까 Ball로 비교해라
    public BallResult matchStatus(Ball otherBall){
        //스트라이크
        if(this.number == otherBall.number &&
                this.position == otherBall.position){
            //enum활용
            return BallResult.STRIKE;
            //ballresult.
            //return "STRIKE";
        }
        if (this.number == otherBall.number){
            return BallResult.BALL;
            //return "BALL";
        }
        //return "NOTHING";
        return BallResult.NOTHING;
    }


}
