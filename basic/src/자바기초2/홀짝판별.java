package 자바기초2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 홀짝판별 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n%2 == 0 ? "짝수" : "홀수");

    }
}
