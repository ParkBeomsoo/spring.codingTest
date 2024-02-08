import java.util.Scanner;

public class CodingTest0203 {
    public void solution(int cnt, int[] a, int[] b){
        StringBuilder answer = new StringBuilder();
        int max = 0;
        for (int i = 0; i<cnt; i++){
            if(a[i]==b[i]){
                System.out.println('D');
            }else if(a[i]+1==b[i]||a[i]-2==b[i]){
                System.out.println('B');
            }else{
                System.out.println('A');
            }
        }
    }

    public static void main(String[] args) {
        CodingTest0203 codingTest0203 = new CodingTest0203();
        Scanner kb = new Scanner(System.in);
        int cnt = Integer.parseInt(kb.next());

        int[] a = new int[cnt];
        int[] b = new int[cnt];
        for(int i=0;i<cnt;i++){
            a[i]= Integer.parseInt(kb.next());
        }
        for(int i=0;i<cnt;i++){
            b[i]= Integer.parseInt(kb.next());
        }
        codingTest0203.solution(cnt, a, b);
    }
}