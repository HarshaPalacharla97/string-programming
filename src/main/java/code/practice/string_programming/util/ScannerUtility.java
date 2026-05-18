package code.practice.string_programming.util;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Scanner;

@UtilityClass
public class ScannerUtility {

    private Scanner scanner = new Scanner(System.in);

    public String inputString(){
        System.out.println("Enter a String to process :: ");
        String parameter = scanner.next();
        return parameter;
    }

    public int inputInteger(){
        System.out.println("Enter the length of Sub String :: ");
        int subStringSize = scanner.nextInt();
        return subStringSize;
    }

}
