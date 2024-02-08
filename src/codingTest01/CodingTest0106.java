package codingTest01;

import java.util.Scanner;

public class CodingTest0106 {
    public String solution(String str){
        String answer= "";
            for(int i=0;i<str.length();i++){
                if(i==str.indexOf(str.charAt(i)))
                    answer += str.charAt(i);
            }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0106 codingTest0106 = new CodingTest0106();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0106.solution(str));
    }
}