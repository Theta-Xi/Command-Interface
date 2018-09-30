package me.jtrenaud1s;

import me.jtrenaud1s.commands.Command;

import java.util.HashMap;

public class CommandManager {
    private HashMap<String, Command> commands;
    public CommandManager() {
        commands = new HashMap<>();
    }

    public void registerCommand(String name, Command cmd) {
        commands.put(name, cmd);
    }

    public HashMap<String, Command> getRegisteredCommands() {
        return commands;
    }

    // Checks if command is registered
    // If so, executes the command
    public void handle(String cmd, String[] args) {
        if(isRegistered(cmd))
            commands.get(cmd).execute(args);
        else
            System.out.println("That command does not exist!");
    }

    public boolean isRegistered(String cmd) {
        return commands.get(cmd) != null;
    }
}
