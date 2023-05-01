package br.com.cod3r.command.migration.commands;

import java.util.List;
import java.util.Map;

public abstract class MigrationCommand {
	protected Map<String, List<String>> database;
	
	protected MigrationCommand(Map<String, List<String>> database) {
		this.database = database;
	}

	protected void createTable(String tableName, List<String> colluns) {
		database.put(tableName, colluns);
	}
	
	public abstract void execute();
	public abstract void undo();
}
