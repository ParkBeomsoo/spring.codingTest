import java.util.Scanner;

public class CodingTest0109 {
    public int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        CodingTest0109 codingTest0109 = new CodingTest0109();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0109.solution(str));
    }
}