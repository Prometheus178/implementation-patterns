package behavioral.command.commands;

import behavioral.command.Database;

public class SelectCommand implements Command{

    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
