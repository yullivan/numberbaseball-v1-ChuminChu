package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {

    @Test
    void gameresultTest(){
        Balls computerBalls = new Balls(List.of(
                new Ball(1, 1),
                new Ball(2, 2),
                new Ball(3, 3)));

        Balls userBalls1 = new Balls(List.of(
                new Ball(1,1),
                new Ball(2,2),
                new Ball(3,3)));

        GameResult result = computerBalls.ballsBallsMatchStatus(userBalls1);

        assertThat(result.isGameOver()).isTrue();
        assertThat(result.strikesCount).isEqualTo(3);
        assertThat(result.ballCount).isEqualTo(0);

        Balls userBalls2 = new Balls(List.of(
                new Ball(3,1),
                new Ball(2,2),
                new Ball(1,3)));

        GameResult result2 = computerBalls.ballsBallsMatchStatus(userBalls2);

        assertThat(result2.isGameOver()).isFalse();
        assertThat(result2.strikesCount).isEqualTo(1);
        assertThat(result2.ballCount).isEqualTo(2);

        Balls userBalls3 = new Balls(List.of(
                new Ball(3,1),
                new Ball(9,2),
                new Ball(1,3)));

        GameResult result3 = computerBalls.ballsBallsMatchStatus(userBalls3);

        assertThat(result3.isGameOver()).isFalse();
        assertThat(result3.strikesCount).isEqualTo(0);
        assertThat(result3.ballCount).isEqualTo(2);

        Balls userBalls4 = new Balls(List.of(
                new Ball(4,1),
                new Ball(5,2),
                new Ball(6,3)));

        GameResult result4 = computerBalls.ballsBallsMatchStatus(userBalls4);

        assertThat(result4.isGameOver()).isFalse();
        assertThat(result4.strikesCount).isEqualTo(0);
        assertThat(result4.ballCount).isEqualTo(0);

    }


}
