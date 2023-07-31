package com.workintech.inheritance.model;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
    setLength(length);
    setWidth(width);
    }

    public void setLength(double length) {
        if(length<0){
            length=0;
        }else{
            this.length=length;
        }
    }

    public void setWidth(double width) {
       if(width<0){
           width=0;
       }else{
           this.width=width;
       }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
}
