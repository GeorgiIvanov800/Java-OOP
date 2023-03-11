package BirthdayCelebrations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirthdayCelebratioinsHandler handler = new BirthdayCelebratioinsHandler("End");

        handler.readAndHandleCommandsToEnd(scanner);


    }
}
