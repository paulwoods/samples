package com.habuma.spring.xmlsucks;

import javax.inject.Named;

@Named
public class Speakers implements OutputDevice {
  public void emit(String content) {
    System.out.println("SPEAKERS PLAYING:  " + content);
  }
}
