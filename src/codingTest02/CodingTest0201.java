package codingTest02;

import java.util.Scanner;

public class CodingTest0201 {
    public String solution(int cnt, int[] numArray){
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<cnt; i++){
            if(numArray[i] < numArray[i+1]){
                answer.append(numArray[i+1]);
                if(i<cnt-1){
                    answer.append(" ");
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        CodingTest0201 codingTest0201 = new CodingTest0201();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());

        int[] numArray = new int[cnt+1];
        numArray[0] = 0;
        for(int i=1;i<=cnt;i++){
            numArray[i]= Integer.parseInt(kb.next());
        }
        System.out.print(codingTest0201.solution(cnt, numArray));
    }
}