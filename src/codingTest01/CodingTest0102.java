package codingTest01;

import java.util.Scanner;

public class CodingTest0102 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))
                answer+=Character.toUpperCase(x);
            else
                answer+=Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0102 codingTest0102 = new CodingTest0102();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0102.solution(str));

    }
}