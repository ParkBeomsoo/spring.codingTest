package codingTest02;

import java.util.Scanner;

public class CodingTest0204 {
    public String solution(int cnt){
        StringBuilder answer = new StringBuilder();
        int a = 0;
        int b = 1;
        int c = 0;
        answer.append(1);
        for (int i = 1; i<cnt; i++){
            answer.append(" ").append(a + b);
            c = a;
            a = b;
            b = c+b;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        CodingTest0204 codingTest0203 = new CodingTest0204();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());

        System.out.print(codingTest0203.solution(cnt));
    }
}