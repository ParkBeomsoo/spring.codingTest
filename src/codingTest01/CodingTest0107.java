package codingTest01;

import java.util.Scanner;

public class CodingTest0107 {
    public String solution(String str){
        String answer= "NO";
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0107 codingTest0107 = new CodingTest0107();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0107.solution(str));
    }
}