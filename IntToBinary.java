//Part (a)

import java.util.Scanner;
public class IntToBinary {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Enter an Integer for conversion: ");
        int integer = read.nextInt();

        String binary = "";

        while(integer > 0){
            int remainder = integer % 2;
            binary = remainder + binary;
            integer = integer / 2;
        }

        System.out.println("The binary is " + binary );

    }
}
