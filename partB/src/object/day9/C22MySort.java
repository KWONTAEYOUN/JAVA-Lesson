package object.day9;

import java.util.Arrays;

// 순자정렬 알고리즘 구현하기
public class C22MySort {
    public static void main(String[] args) {
        int[] numbers = { 67, 34, 65, 89, 54 };
        System.out.println("초기 numbers : " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 오름 차순은 numbers[i]가 numbers[j]값보다 작거나 같아야 한다.
                // 그렇지 않으면 numbers[i] 와 numbers[j]를 교환하기 -> 교환조건??
                if (numbers[i] > numbers[j]) { // 왼쪽 값 > 오른쪽 값
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                // 비교 조건과 맞지 않으면 numbers[i]와 numbers[j]를 교환하기
                System.out.println();
                System.out.println(String.format("중간 상태 : i = %d, j = %d 배열 : %s", i, j, Arrays.toString(numbers)));
            }
        }
        System.out.println("오름차순 정렬 후 numbers : " + Arrays.toString(numbers));

        System.out.println("\n내림차순 정렬 전 numbers : " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 내림 차순은 numbers[i]가 numbers[j]값보다 그거나 같아야 한다.
                // 그렇지 않으면 numbers[i] 와 numbers[j]를 교환하기 -> 교환조건??
                if (numbers[i] < numbers[j]) { // 왼쪽 값 > 오른쪽 값
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                // 비교 조건과 맞지 않으면 numbers[i]와 numbers[j]를 교환하기
                System.out.println();
                System.out.println(String.format("중간 상태 : i = %d, j = %d 배열 : %s", i, j, Arrays.toString(numbers)));
            }
        }
        System.out.println("\n내림차순 정렬 후 numbers : " + Arrays.toString(numbers));

    }
}