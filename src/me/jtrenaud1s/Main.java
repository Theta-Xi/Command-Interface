package me.jtrenaud1s;

import me.jtrenaud1s.commands.QuitCommand;
import me.jtrenaud1s.commands.QuoteCommand;
import me.jtrenaud1s.commands.YellCommand;

import java.util.Scanner;

public class Main {
    private boolean running;
    private Scanner scanner;
    private CommandManager cmdMan;

    public static void main(String[] args) {
        new Main();
    }

    // Initialize CommandManager, register commands, and start listening for commands
    public Main() {
        cmdMan = new CommandManager();
        cmdMan.registerCommand("quit", new QuitCommand(this, "quit"));
        cmdMan.registerCommand("yell", new YellCommand("yell"));
        cmdMan.registerCommand("quote", new QuoteCommand("quote"));
        running = true;
        scanner = new Scanner(System.in);
        start();
    }

    // Listens for commands, when it receives one, it sends it and the arguments to the command manager so it can run handle();
    public void start() {
        String input;
        while(running && (input = scanner.nextLine()) != null) {
            String[] cmdArr = input.split(" ");
            String cmd = cmdArr[0];
            String[] args = new String[cmdArr.length - 1];
            for(int i = 1; i < cmdArr.length; i++) {
                args[i-1] = cmdArr[i];
            }
            cmdMan.handle(cmd, args);
        }
    }

    // If running is set to false, the loop that waits for commands to be entered will break because the condition is no longer met.
    public void quit(){
        running = false;
    }
}
