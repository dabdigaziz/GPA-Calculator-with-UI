package com.company.dbMethods;

import com.company.User;
import com.company.data.interfaces.IDBConnect;
import com.company.dbMethods.interfaces.IMethods;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class db_methods implements IMethods {
    private final IDBConnect db;

    public db_methods(IDBConnect db){
        this.db = db;
    }

    @Override
    public boolean createTableUsers() {
        Connection con = null;
        try{
            con = db.connect();
            PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS users(id serial PRIMARY KEY, username VARCHAR(256), gpa int)");
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean createTableSubjects() {
        Connection con = null;
        try{
            con = db.connect();
            PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS subjects(id int, subject_name VARCHAR(256), credits int, grade int)");
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean insertUser(String name, double gpa) {
        Connection con = null;
        try {
            con = db.connect();
            String sql = "INSERT INTO users(username, gpa) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setDouble(2, gpa);

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean insertSubject(int id, String subject_name, int credits, int grade) {
        Connection con = null;
        try {
            con = db.connect();
            String sql = "INSERT INTO subjects(id, subject_name, credits, grade) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);
            st.setString(2, subject_name);
            st.setInt(3, credits);
            st.setInt(4, grade);

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public int getId(String username) {
        Connection con = null;
        try {
            con = db.connect();
            String sql = "SELECT id FROM users WHERE username=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, username);

            ResultSet rs = st.executeQuery();
            System.out.println(rs);
            System.out.println(rs.getInt(1));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
        Connection con = null;
        try {
            con = db.connect();
            String sql = "SELECT id, username, gpa FROM users";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("username"), rs.getInt("gpa"));
                users.add(user);
            }

            return users;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
