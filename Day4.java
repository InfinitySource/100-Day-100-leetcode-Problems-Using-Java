// 1137. N-th Tribonacci Number

import java.util.Scanner;

public class Day4{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int input = scn.nextInt();
        

        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = 1;

        int sum = 0;

        for(int i = 1; i <= input; i++){
            sum = firstNum + secondNum + thirdNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = sum;
        }

        System.out.println(firstNum);

    }
}