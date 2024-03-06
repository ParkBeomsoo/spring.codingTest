package codingTest02;

import java.util.Scanner;

public class CodingTest0210 {
    public int solution(int[][] value){
        int answer = 1;
        int max = 0;
        boolean[][] check = new boolean[value.length][value.length];

        for(int i=0; i < 5; i++){
            for(int j=0; j < value.length; j++) {
                for(int k=j+1;k<value.length;k++){
                    if(value[j][i]==value[k][i]){
                        check[j][k] = true;
                        check[k][j] = true;
                    }
                }
            }
        }

        for(int i=0; i < value.length; i++){
            int count = 0;
            for(int j=0; j < value.length; j++){
                if(check[i][j]){
                    count++;
                }
            }
            if(max<count){
                max = count;
                answer=i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0210 codingTest0210 = new CodingTest0210();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[][] value = new int[cnt][5];
        for(int i=0;i<cnt;i++){
            for(int j=0;j<5;j++){
                value[i][j]= Integer.parseInt(kb.next());
            }
        }
        System.out.print(codingTest0210.solution(value));
    }
}