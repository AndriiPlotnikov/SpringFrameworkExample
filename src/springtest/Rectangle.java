/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

/**
 *
 * @author Андрей
 */
public class Rectangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
    
    
    
    @Override
    public void draw() {
        System.out.println("rectangle is drawn!");
        System.out.println("Point A: (" + pointA.getX() + ";" + pointA.getY() + ")");
        System.out.println("Point B: (" + pointB.getX() + ";" + pointB.getY() + ")");
        System.out.println("Point C: (" + pointC.getX() + ";" + pointC.getY() + ")");
        System.out.println("Point D: (" + pointD.getX() + ";" + pointD.getY() + ")");
    }
    
    /**
     * custom method for xml.config to call as "init-method"
     */
    public void initMethod(){
        System.out.println("initialization of rectangle object!");
    }
    
    /**
     * custom method for xml.config to call as "destroy-method"
     */
    public void destroyMethod(){
        System.out.println("destruction of rectangle object!");
    }
    
}
