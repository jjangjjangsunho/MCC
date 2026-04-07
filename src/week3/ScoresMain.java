import java.util.Scanner;

public class ScoresMain {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 수를 입력해주세요");
        int student = scanner.nextInt();
        int[] score = new int[student];
        scanner.nextLine();

        System.out.println("점수를 입력해주세요");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }


        while (true) {
            System.out.println("=====메뉴 선택=====");
            System.out.println("1. 전체 점수 출력");
            System.out.println("2. 평균 점수");
            System.out.println("3. 최고 점수");
            System.out.println("4. 특정 점수 이상 학생 수");
            System.out.println("5. 종료");

            int menu = scanner.nextInt();

            if (menu == 1) {
                printAllScores(score, student);
            } else if (menu == 2) {
                double average = getAverage(score);
                System.out.println(average);
            } else if (menu == 3) {
                int max = getMax(score);
                System.out.println(max);
            } else if (menu == 4) {
                int target = scanner.nextInt();
                countAboveScore(score, target);
            } else {
                break;
            }
        }

    }

    public static void printAllScores(int[] score, int student) {
        for (int i = 0 ; i < score.length ; i++) {
            System.out.println(score[i]);
        }
    }

    public static double getAverage(int[] score) {
        int total = 0;
        for (int i = 0 ; i < score.length; i++) {
            total += score[i];
        }
        return (double) total / score.length;
    }

    public static int getMax(int[] score) {
        int max = 0;
        for (int i = 0 ; i < score.length ; i++) {
            if ( score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }

    public static void countAboveScore(int[] score, int target) {
        int count = 0;
        for (int i = 0 ; i < score.length ; i++) {
            if (score[i] >= target) {
                count++;
            }
        }
        System.out.println(count);
    }
}

