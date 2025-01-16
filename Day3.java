// 509. Fibonacci Number

import java.util.Scanner;

public class Day3{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int input = scn.nextInt();

        if(input == 0){
            System.out.println(0);
        }else if(input==1){
            System.out.println(1);
        }
        

        int firstNum = 0;
        int secondNum = 1;

        int sum = 0;

        for(int i = 1; i <= input; i++){
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }

        System.out.println(firstNum);

    }
}