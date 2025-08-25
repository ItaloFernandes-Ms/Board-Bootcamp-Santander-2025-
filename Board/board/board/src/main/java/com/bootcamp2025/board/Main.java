package com.bootcamp2025.board;

import com.bootcamp2025.board.persistence.migration.MigrationStrategy;
import com.bootcamp2025.board.ui.MainMenu;

import java.sql.SQLException;

import static com.bootcamp2025.board.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
