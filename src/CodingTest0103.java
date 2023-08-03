import java.util.Scanner;

public class CodingTest0103 {
    public String solution(String str){
        String answer="";
        int min = Integer.MIN_VALUE;
        for(String x : str.split(" ")){
            if(min<x.length()) {
                min = x.length();
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0103 codingTest0103 = new CodingTest0103();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(codingTest0103.solution(str));

    }
}