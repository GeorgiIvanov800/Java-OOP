package Reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        try {
            Constructor<BlackBoxInt> declaredConstructor = blackBoxIntClass.getDeclaredConstructor();
            declaredConstructor.newInstance();
        } catch (NoSuchMethodException |IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new IllegalStateException(e);
        }

        BlackBoxInt blackBoxInt = new BlackBoxInt();


        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] commandParts = command.split("_");
            String methodName = commandParts[0];
            int parameter = Integer.parseInt(commandParts[1]);

            command = scanner.nextLine();
        }
    }
}
