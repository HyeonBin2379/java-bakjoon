package programmers;

import java.util.Arrays;

class MultiplyingMatrixSolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr2[0].length; k++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return answer;
    }
}
public class MultiplyingMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(new MultiplyingMatrixSolution().solution(arr1, arr2)));
    }
}
