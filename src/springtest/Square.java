/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Андрей
 */
@Component
public class Square implements Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    @Bean
    public Square square(){
        return new Square();
    }
    
    public Point getPointA() {
        return pointA;
    }
    
    @Resource
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Resource
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Resource
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    @Resource
    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public void draw() {
        System.out.println("square is drawn!");
        System.out.println("Point A: (" + pointA.getX() + ";" + pointA.getY() + ")");
        System.out.println("Point B: (" + pointB.getX() + ";" + pointB.getY() + ")");
        System.out.println("Point C: (" + pointC.getX() + ";" + pointC.getY() + ")");
        System.out.println("Point D: (" + pointD.getX() + ";" + pointD.getY() + ")");
    }
    
    
}
