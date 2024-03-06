package codingTest02;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest0208 {
    public int solution(int[][] value){
        int answer = 0;
        int result = 0;
        int result2 = 0;

        for(int i=0; i < value.length; i++){
            for (int j=0; j < value.length; j++) {
                result += value[i][j];
                result2 += value[j][i];
          }
            if(answer<result){
                answer = result;
            }
            if(answer<result2){
                answer = result2;
            }
                result=0;
                result2=0;
        }

        for(int i=0; i < value.length; i++){

            result += value[i][i];
            result2 += value[value.length-1-i][i];
        }

        if(answer<result){
            answer = result;
        }
        if(answer<result2){
            answer = result2;
        }


        return answer;
    }

    public static void main(String[] args) {
        CodingTest0208 codingTest0208 = new CodingTest0208();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[][] value = new int[cnt][cnt];
        for(int i=0;i<cnt;i++){
            for(int j=0;j<cnt;j++){
                value[i][j]= Integer.parseInt(kb.next());
            }
        }
        System.out.print(codingTest0208.solution(value));
    }
}