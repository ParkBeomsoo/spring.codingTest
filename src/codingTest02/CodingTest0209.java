package codingTest02;

import java.util.Scanner;

public class CodingTest0209 {
    public int solution(int[][] value){
        int answer = 0;
        int[] x = {-1,0,1,0};
        int[] y = {0,-1,0,1};

        for(int i=0; i < value.length; i++){
            for (int j=0; j < value.length; j++) {
                boolean check = true;
                for(int k=0; k < 4 ; k++){
                    int nx = i+x[k];
                    int ny = j+y[k];
                    if(nx>=0&&ny>=0&&nx<value.length&&ny<value.length&&value[nx][ny]>=value[i][j]){
                        check = false;
                    }
                }
                if(check){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0209 codingTest0209 = new CodingTest0209();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[][] value = new int[cnt][cnt];
        for(int i=0;i<cnt;i++){
            for(int j=0;j<cnt;j++){
                value[i][j]= Integer.parseInt(kb.next());
            }
        }
        System.out.print(codingTest0209.solution(value));
    }
}