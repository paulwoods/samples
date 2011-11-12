package com.habuma.spring.xmlsucks;

import org.springframework.stereotype.Component;

@Component
public class Speakers implements OutputDevice {
  public void emit(String content) {
    System.out.println("SPEAKERS PLAYING:  " + content);
  }
}
