package com.company;

import com.company.data.DBConnect;
import com.company.data.interfaces.IDBConnect;
import com.company.dbMethods.db_methods;
import com.company.dbMethods.interfaces.IMethods;
import com.company.methods.methods;

public class Main {
    public static void main(String[] args) {
        IDBConnect db = new DBConnect();
        IMethods db_methods = new db_methods(db);
        methods methods = new methods(db_methods);
        AddStudentDetails app = new AddStudentDetails(methods);
        app.start();
    }

}
