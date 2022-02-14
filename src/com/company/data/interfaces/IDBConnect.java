package com.company.data.interfaces;
import java.sql.Connection;
import java.sql.SQLException;

public interface IDBConnect {
    Connection connect() throws SQLException, ClassNotFoundException;
}
