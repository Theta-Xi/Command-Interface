package me.jtrenaud1s.commands;

import me.jtrenaud1s.CommandExecutor;
import me.jtrenaud1s.Main;

public class QuitCommand extends Command implements CommandExecutor {
    private Main main;
    public QuitCommand(Main main, String name) {
        super(name);
        this.main = main;
    }

    @Override
    public boolean onExecute(String[] args) {
        main.quit();
        return true;
    }
}
