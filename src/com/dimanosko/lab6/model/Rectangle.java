package com.dimanosko.lab6.model;

public class Rectangle  {
    private int sideA;
    private int sideB;
    private int are;
    private int perimetr;
    private String color;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public int getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = perimetr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", are=" + are +
                ", perimetr=" + perimetr +
                ", color='" + color + '\'' +
                '}';
    }
}
