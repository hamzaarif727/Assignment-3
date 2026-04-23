//Part (b)

import java.util.Scanner;
public class ArrFuncIntToBin {
    static int[] IntToBin(int num) {
        int n = num;
        int count = 0;

        while (n > 0) {                   //figuring out the number of bits num needs in binary
            count = count + 1;
            n = n / 2;
        }

        int[] binArr = new int[count];
        int index = count-1;

        while (num > 0) {
            int remainder = num % 2;
            binArr[index] = remainder;
            num = num / 2;
            index = index - 1;

        }

        return binArr;
    }

    public static void  main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int integer = read.nextInt();

        int[] output = IntToBin(integer);

        System.out.print("The binary is: ");
        for(int i=0; i < output.length;i++){
            System.out.print(output[i]);
        }
    }
}
