/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author LENOVO
 */
public class Student {
    private String name;
    private double score;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setScore(double score) {
        this.score = score;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getScore() {
        return this.score;
    }
}
