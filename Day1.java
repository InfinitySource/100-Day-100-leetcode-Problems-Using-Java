// Palindrom Number

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt();

        int n = input;
        // int temp = input;
        int revNumber = 0;

        if(n < 0){
            System.out.println(false);
        }

        while (n > 0) {
            
            int digit = n % 10;
            
            revNumber = revNumber * 10 + digit;

            n = n/10;

        }

        if(revNumber == input){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scn.close();
    }
}

