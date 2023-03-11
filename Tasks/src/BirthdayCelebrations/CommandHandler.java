package BirthdayCelebrations;

import java.util.List;
import java.util.Scanner;

public abstract class CommandHandler {
    private final String endCommand;
    public CommandHandler(String endCommand){
        this.endCommand = endCommand;
    }

    public void readAndHandleCommandsToEnd(Scanner scanner) {

        boolean reachedEnd = this.handleCommand(scanner.nextLine());
        while (!reachedEnd) {
            reachedEnd = this.handleCommand(scanner.nextLine());
        }
    }

    public boolean handleCommand(String command) {
        if (command.equals(this.endCommand)) {
            return true;
        }
        return false;
    }
    protected abstract void processNonEndCommand(String command);

}
