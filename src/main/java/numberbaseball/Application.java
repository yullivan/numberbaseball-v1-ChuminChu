package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");
        //변수를 3개 만들어 컴퓨터의 숫자를 기억시켜 둡니다
//        int computerNum1 = 3;
//        int computerNum2 = 5;
//        int computerNum3 = 6;


        while (true) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int userNum1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int userNum2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int userNum3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요


            // TODO: 결과를 출력하세요 (예: "1 스트라이크")


            // TODO: 3 스트라이크인 경우 게임을 끝내세요


        }

        // System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
