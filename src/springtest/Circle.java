/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import java.util.Locale;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import springtest.event.handling.CustomEvent;

/**
 *
 * @author Андрей
 */
public class Circle implements Shape, ApplicationContextAware, ApplicationEventPublisherAware {

    /**
     * center of the circle
     */
    private Point pointA;
    
    private ApplicationEventPublisher aep;

    private ApplicationContext ac = null;

    @Autowired
    private MessageSource messageSource;

    public ApplicationContext getAc() {
        return ac;
    }

    public void setAc(ApplicationContext ac) {
        this.ac = ac;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    
    public Circle(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointA() {
        return pointA;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn, center is: (" + pointA.getX() + ";" + pointA.getY() + ")");
        System.out.println("With context as: " + ac.getDisplayName());
        System.out.println(messageSource.getMessage("msgKey", null, "default greeting", null));
        
        shootCustomEvent();
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.ac = ac;
    }

//    code test for : InitializingBean, DisposableBean interfaces
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init after properties set, circle!");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("init after object is destroyed");
//    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher aep) {
        this.aep = aep;
    }

    private void shootCustomEvent() {
        aep.publishEvent(new CustomEvent(this));
    }
}
