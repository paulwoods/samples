package com.habuma.spring.xmlsucks;

import grails.spring.BeanBuilder;

import org.springframework.context.ApplicationContext;

public class Main {
  public static void main(String[] args) throws Exception {
    BeanBuilder bb = new BeanBuilder();
    bb.loadBeans("classpath:GroovyConfig.groovy");
    ApplicationContext context = bb.createApplicationContext();
    Player player = (Player) context.getBean("player");
    player.play();  }
}
