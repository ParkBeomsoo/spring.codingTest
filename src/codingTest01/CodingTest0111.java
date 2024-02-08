package codingTest01;

import java.util.Scanner;

public class CodingTest0111 {
    public String solution(String str){
        str+=' ';
        String answer = "";
        int cnt=1;
        for(int i=0;i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else{
                answer+= str.charAt(i);
                if(cnt>1) answer+=cnt;
                cnt=1;
            }
        }
//        for(char x : str.toCharArray()){
//            if(x != check){
//                answer+=check;
//                if(checkNum>1) answer+=checkNum;
//                check=x;
//                checkNum=1;
//            }else{
//                checkNum++;
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest0111 codingTest0111 = new CodingTest0111();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(codingTest0111.solution(str));
    }
}