
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.sql.*;
/**
 *
 * @author ALAN
 */
public class ConnDB {
    
    public StringBuffer selectAll() {
        String connectionURL = "jdbc:derby://localhost:1527/Alan";
        StringBuffer sb = new StringBuffer();
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560");
            String sql = "SELECT * FROM STUDENT";
            Statement st = conn.createStatement();
            ResultSet rs = null;
            rs=st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name")+"\t"+rs.getDouble("score"));
                sb.append(rs.getString("name")+"\t"+rs.getDouble("score")+"\n");
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        }
        return sb;
    }
    
    public boolean insertNew(String name, Double score) {
        String connectionURL = "jdbc:derby://localhost:1527/Alan";
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560");
            String sql = "INSERT INTO IS2560.STUDENT (NAME, SCORE) VALUES ('" + name + "'," + score + ")";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public double selectScore(String name) {
        String connectionURL = "jdbc:derby://localhost:1527/Alan";
        double score = 0;
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560");
            String sql = "SELECT Name, Score FROM STUDENT where Name = '" + name + "'";
            Statement st = conn.createStatement();
            ResultSet rs = null;
            rs=st.executeQuery(sql);
            while(rs.next()){
                score = rs.getDouble("score");
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            return -1;
        }
        return score;
    }
    
    public boolean updateScore(String name, double newScore) {
        String connectionURL = "jdbc:derby://localhost:1527/Alan";
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560");
            String sql = "update STUDENT set Score = " + newScore + "where Name = '" + name + "'";
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
