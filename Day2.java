// Power of Tow 

import java.util.Scanner;

public class Day2{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int input = scn.nextInt();
        
        if(input < 1){
            System.out.println(false);
        }else if(input == 1){
            System.out.println(true);
        }


        while (input % 2 == 0) {
            input = input /2;
        }

        if(input == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}