package com.habuma.spring.xmlsucks;


public class Speakers implements OutputDevice {
  public void emit(String content) {
    System.out.println("SPEAKERS PLAYING:  " + content);
  }
}
