package br.com.cod3r.command.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AdressTable extends MigrationCommand {

    public AdressTable(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        String table = "Address";
        List<String> coluns = new ArrayList<>(Arrays.asList("name", "number", "street"));
        createTable(table, coluns);
    }

    @Override
    public void undo() {
        database.remove("Address");
    }
}
