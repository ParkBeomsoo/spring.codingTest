package codingTest02;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest0208 {
    public String solution(int[] value){
        StringBuilder answer = new StringBuilder();

        for(int j=0; j<value.length; j++){
            int check=1;
            for(int i=0; i<value.length; i++){
                if(value[j]<value[i]){
                    check++;
                }
            }
            answer.append(check);
            if(j<value.length-1){
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        CodingTest0208 codingTest0208 = new CodingTest0208();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[] value = new int[cnt];
        for(int i=0;i<cnt;i++){
            value[i]= Integer.parseInt(kb.next());
        }

        System.out.print(codingTest0208.solution(value));
    }
}