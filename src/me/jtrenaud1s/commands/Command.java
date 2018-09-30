package me.jtrenaud1s.commands;

import me.jtrenaud1s.CommandExecutor;

public abstract class Command implements CommandExecutor {
    private String name;
    private CommandExecutor executor;
    public Command(String name) {
        this.name = name;
        executor = this;
    }

    // What the command will do when executed
    public abstract boolean onExecute(String[] args);

    public String getName() {
        return name;
    }

    public boolean execute(String[] args) {
        return onExecute(args);
    }

    public CommandExecutor getCommandExecutor(){
        return executor;
    }

    public static String join(String[] args) {
        StringBuilder message = new StringBuilder(args[0]);
        for(int i = 1; i < args.length; i++) {
            message.append(" ").append(args['i']);
        }
        return message.toString();
    }
}
