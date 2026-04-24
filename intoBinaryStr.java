//Part (c)

import java.util.Scanner;
public class intoBinaryStr {
    static String binaryString(int num){
         String bin = "";

         while(num>0) {

             int remainder = num % 2;
             bin = remainder + bin;
             num = num / 2;
         }
         return bin;
    }

    public static void  main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Enter an Integer number: ");
        int x = read.nextInt();

        String binStrResult = binaryString(x);
        System.out.println("The Binary is: "+ binStrResult);
    }
}
