/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author Андрей
 */
public class Triangle implements Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    @Required
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Required
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Required
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("triangle drawn 4" + " (" + pointA.getX() + ";" + pointA.getY() + ")" +
                " (" + pointB.getX() + ";" + pointB.getY() + ")" + 
                " (" + pointC.getX() + ";" + pointC.getY() + ")"
                        );
    }
}
