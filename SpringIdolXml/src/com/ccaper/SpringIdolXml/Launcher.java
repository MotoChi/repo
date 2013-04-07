package com.ccaper.SpringIdolXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccaper.SpringIdolXml.exceptions.PerformanceException;
import com.ccaper.SpringIdolXml.performers.Performer;

public class Launcher {
  public static void main(String[] args) throws PerformanceException {
    ApplicationContext ctx = new ClassPathXmlApplicationContext(
        "com/ccaper/SpringIdolXml/spring/spring-config.xml");
    Performer duke = (Performer) ctx.getBean("duke");
    duke.perform();
    Performer duke15 = (Performer) ctx.getBean("duke15");
    duke15.perform();
    Performer poeticDuke = (Performer) ctx.getBean("poeticDuke");
    poeticDuke.perform();
    ((ConfigurableApplicationContext) ctx).close();
  }
}
