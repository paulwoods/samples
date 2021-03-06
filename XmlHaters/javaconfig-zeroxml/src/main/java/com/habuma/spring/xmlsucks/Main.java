package com.habuma.spring.xmlsucks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = 
      new AnnotationConfigApplicationContext(SoundSystemConfig.class);
    
    Player player = context.getBean(Player.class);
    player.play();
  }
}
