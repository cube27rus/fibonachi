import java.util.Scanner;

/**
 * Created by Cube27 on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Main student = new Main();
        System.out.println(student.fibonachi(a));


    }

    public int fibonachi(int count){
        int prev=0;
        int cur =1;
        int result =1;
        for(int i=2;i<=count;i++){

            result=prev+cur;
            prev=cur;
            cur=result;
        }
        return result;
    }
}
