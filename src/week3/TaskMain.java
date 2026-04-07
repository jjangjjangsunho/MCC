package week3;

import java.util.Scanner;

public class TaskMain {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] num = new int[size];
        int count = 0;

        for (int i = 0 ; i < size ; i++){
            num[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        for (int j = 0 ; j < size ; j++){
            if (num[j] == target){
                count++;
            }
        }
        System.out.println(count);

    }
}
