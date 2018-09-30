package me.jtrenaud1s.commands;

import com.sun.deploy.util.StringUtils;
import me.jtrenaud1s.CommandExecutor;

public class YellCommand extends Command implements CommandExecutor {
    public YellCommand(String name) {
        super(name);
    }

    // What the command will do when executed
    @Override
    public boolean onExecute(String[] args) {
        if(args.length > 0) {

            System.out.println(Command.join(args).toUpperCase());
            return true;
        } else {
            System.out.println("Please enter a message!");
        }
        return false;
    }
}
