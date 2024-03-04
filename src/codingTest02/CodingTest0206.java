package codingTest02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingTest0206 {
    public String solution(int[] value){
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i<value.length; i++){
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(value[i])).reverse().toString());
            boolean primeNumberYn = true;
            for (int j = 2; j<=Math.sqrt(reverse); j++){
                if ( reverse % j == 0) {
                    primeNumberYn = false;
                    continue;
                }
            }
            if(primeNumberYn && reverse != 1){
                answer.append(reverse);
                if(i<value.length-1){
                    answer.append(" ");

                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        CodingTest0206 codingTest0206 = new CodingTest0206();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[] value = new int[cnt];
        for(int i=0;i<cnt;i++){
            value[i]= Integer.parseInt(kb.next());
        }

        System.out.print(codingTest0206.solution(value));
    }
}