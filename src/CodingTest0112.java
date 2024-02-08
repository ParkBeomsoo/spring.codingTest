import java.util.Scanner;

public class CodingTest0112 {
    public String solution(int num, String str){
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<num; i++){
            int count = 0;
            for(int j=0; j<7; j++){
                if(str.charAt(i*7+j) == '#'){
                    count += (int) Math.pow(2, 6-j);
                }
            }
            answer.append((char)count);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        CodingTest0112 codingTest0112 = new CodingTest0112();
        Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.next());
        String str = kb.next();
        System.out.print(codingTest0112.solution(num, str));
    }
}