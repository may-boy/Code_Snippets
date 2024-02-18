package practice.hackerrank.basic.loops;

import java.util.Scanner;

public class JavaLoopsSecond {

    //    Sample Input
    //2
    //0 2 10
    //5 3 5

    //    Sample Output

    //2 6 14 30 62 126 254 510 1022 2046
    //8 14 26 50 98
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int j=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int output = a;
            while(j < n) {
                System.out.println("Value to be added: " + (int) (a+((Math.pow(2,j))*b)));
                output += (int) (a+((Math.pow(2,j))*b));
                System.out.print(output + " ");
                j++;
            }
            System.out.println("Exit the program.");
        }
        in.close();
    }
}
