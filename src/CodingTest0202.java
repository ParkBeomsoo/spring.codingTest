import java.util.Scanner;

public class CodingTest0202 {
    public int solution(int cnt, int[] numArray){
        int answer = 0;
        int max = 0;
        for (int j : numArray) {
            if (max < j) {
                max = j;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CodingTest0202 codingTest0202 = new CodingTest0202();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());

        int[] numArray = new int[cnt];
        numArray[0] = 0;
        for(int i=0;i<cnt;i++){
            numArray[i]= Integer.parseInt(kb.next());
        }
        System.out.print(codingTest0202.solution(cnt, numArray));
    }
}