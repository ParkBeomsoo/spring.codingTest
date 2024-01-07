import java.util.Scanner;

public class CodingTest0110 {
    public int[] solution(String str,char c){
        int[] answer = new int[str.length()];
        int p = 1000;
        char[] x = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(x[i]==c){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }

        p = 1000;
        for(int i=str.length()-1;i>=0;i--){
            if(x[i]==c){
                p=0;
            }
            else{
                p++;
                if(p<answer[i]){
                    answer[i]=p;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CodingTest0110 codingTest0110 = new CodingTest0110();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int a : codingTest0110.solution(str,c)){
            System.out.print(a + " ");
        }
    }
}