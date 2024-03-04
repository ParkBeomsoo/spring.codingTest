package codingTest02;

import java.util.Scanner;

public class CodingTest0207 {
    public int solution(int[] value){
        int answer = 0;
        int check = 1;
        for (int i = 0; i<value.length; i++){
            if(value[i] == 1){
                answer += check;
                check++;
            }else{
                check=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0207 codingTest0207 = new CodingTest0207();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());
        int[] value = new int[cnt];
        for(int i=0;i<cnt;i++){
            value[i]= Integer.parseInt(kb.next());
        }

        System.out.print(codingTest0207.solution(value));
    }
}