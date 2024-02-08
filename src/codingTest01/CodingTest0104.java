package codingTest01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingTest0104 {
    public List<String> solution(String[] strArray){
        List<String> answer=new ArrayList<>();
        for(String str : strArray){
            String reverse = new StringBuilder(str).reverse().toString();
            answer.add(reverse);
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0104 codingTest0104 = new CodingTest0104();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String[] strArray = new String[cnt];
        for(int i=0;i<cnt;i++){
            strArray[i]=kb.next();
        }
        for(String answer : codingTest0104.solution(strArray)){
            System.out.println(answer);
        }
    }
}