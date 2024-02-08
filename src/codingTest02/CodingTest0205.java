package codingTest02;

import java.util.Scanner;

public class CodingTest0205 {
    public int solution(int cnt){
        int answer = 0;

        for (int i = 2; i<cnt; i++){
            boolean primeNumberYn = true;
            for (int j = 2; j<=Math.sqrt(i); j++){
                if ( i % j == 0) {
                    primeNumberYn = false;
                    continue;
                }
            }
            if(primeNumberYn){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0205 codingTest0205 = new CodingTest0205();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());

        System.out.print(codingTest0205.solution(cnt));
    }
}