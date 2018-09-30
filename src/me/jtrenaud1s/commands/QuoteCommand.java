package me.jtrenaud1s.commands;

import me.jtrenaud1s.CommandExecutor;

public class QuoteCommand extends Command implements CommandExecutor {

    public QuoteCommand(String name) {
        super(name);
    }

    // What the command will do when executed

    @Override
    public boolean onExecute(String[] args) {
        if(args.length > 0) {
            System.out.println("\"" + Command.join(args) + "\"");
            return true; // Return true when the command executes successfully
        } else {
            System.out.println("Please enter a message!");
        }
        return false;
    }
}
