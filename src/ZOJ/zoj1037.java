package ZOJ;

import java.util.Scanner;

public class zoj1037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total,m,n;
        int count = 0;
        double sum = 0;
        total = in.nextInt();
        while(total > 0){
            m = in.nextInt();
            n = in.nextInt();
            count++;
            System.out.println("Scenario #"+count+":");
            if( m%2 == 0 || n%2 == 0){
                sum = m*n;
            }else{
                sum = m*n +0.41;
            }
            System.out.printf("%#.2f\n",sum);
            System.out.println();
            total --;
        }
    }
}
