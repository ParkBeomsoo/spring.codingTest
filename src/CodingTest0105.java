import java.util.Scanner;

public class CodingTest0105 {
    public String solution(String str){
        String answer= "";
        int lt=0, rt = str.length()-1;
        char[] s = str.toCharArray();
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        CodingTest0105 codingTest0105 = new CodingTest0105();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0105.solution(str));
    }
}