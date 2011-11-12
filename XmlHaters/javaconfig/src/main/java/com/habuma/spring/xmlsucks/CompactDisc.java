package com.habuma.spring.xmlsucks;


public class CompactDisc implements Media {
  private String title;
  public CompactDisc(String title) {
    this.title = title;
  }
  
  public String play() {
    System.out.println("PLAYING CD:  " + title);
    return title;
  }
}
