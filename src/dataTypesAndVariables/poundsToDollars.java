package dataTypesAndVariables;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double pounds =Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f",pounds*1.36);
    }
}
