package codingTest01;

import java.util.Scanner;

public class CodingTest0101 {
    public int solution(String str, char t){
        int answer=0;
        for(char x : str.toCharArray()){
            if(Character.toUpperCase(x) == Character.toUpperCase(t))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0101 codingTest0101 = new CodingTest0101();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(codingTest0101.solution(str, c));
    }
}