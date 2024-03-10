package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Exercise28323 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Stack<Integer> seq = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (seq.isEmpty() || seq.peek() % 2 != num % 2) {
                seq.push(num);
            }
        }
        System.out.println(seq.size());
    }
}
