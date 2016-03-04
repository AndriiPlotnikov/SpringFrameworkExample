/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Андрей
 */
public class SpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Triangle triangle = new Triangle();

        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
        //ApplicationContext context= new ClassPathXmlApplicationContext("springtest/Spring.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springtest/Spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape) context.getBean("shape");

        shape.draw();
    }

}
