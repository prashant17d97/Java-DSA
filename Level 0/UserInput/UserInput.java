package UserInput;

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your desired number");
        int input = scan.nextInt();
        System.out.println("You have entered: "+ input);
        scan.close();
    }
}