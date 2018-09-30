package me.jtrenaud1s;

import me.jtrenaud1s.commands.Command;

public interface CommandExecutor {
    boolean onExecute(String args[]);
}
