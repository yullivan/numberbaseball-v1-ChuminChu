package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    @Test
    void Test() {
        Balls computerBalls1 = new Balls(List.of(
                new Ball(1, 1),
                new Ball(2, 2),
                new Ball(3, 3)));

        Ball userBall1 = new Ball(1, 1);
        Ball userBall2 = new Ball(1, 3);
        Ball userBall3 = new Ball(9, 3);

        assertThat(computerBalls1.ballsMatchStatus(userBall1)).isEqualTo(BallResult.STRIKE);
        assertThat(computerBalls1.ballsMatchStatus(userBall2)).isEqualTo(BallResult.BALL);
        assertThat(computerBalls1.ballsMatchStatus(userBall3)).isEqualTo(BallResult.NOTHING);

        //assertThat(computerBalls1.BallsMatchStatus(userBall1)).isEqualTo("BALL");
        //assertThat(computerBall1.matchStaus(userBall1)).isEqualTo("NOTHING");
    }

}

