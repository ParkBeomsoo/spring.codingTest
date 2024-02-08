package codingTest01;

import java.util.Scanner;

public class CodingTest0108 {
    public String solution(String str){
        String answer= "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)) answer="YES";

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0108 codingTest0108 = new CodingTest0108();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(codingTest0108.solution(str));
    }
}