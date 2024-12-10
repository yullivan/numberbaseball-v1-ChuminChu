package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    @Test
    void test(){
        Ball computerBall1 = new Ball(3,1 );
        Ball computerBall2 = new Ball(7, 1);
        Ball computerBall3 = new Ball(9, 1);

        Ball userBall1 = new Ball(3, 1);
        Ball userBall2 = new Ball(7, 2);
        Ball userBall3 = new Ball(2, 2);

        //String result1 = computerBall1.matchStaus(userBall1);
        assertThat(computerBall1.matchStatus(userBall1)).isEqualTo(BallResult.STRIKE);
        assertThat(computerBall2.matchStatus(userBall2)).isEqualTo(BallResult.BALL);
        assertThat(computerBall3.matchStatus(userBall3)).isEqualTo(BallResult.NOTHING);


        //assertThat(computerBall1.matchStaus(userBall1)).isEqualTo("BALL");
        //assertThat(computerBall1.matchStaus(userBall1)).isEqualTo("NOTHING");
    }
}
