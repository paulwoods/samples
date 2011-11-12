package com.habuma.spring.xmlsucks;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named
public class CompactDisc implements Media {
  @Value("#{systemEnvironment['SONG']}")
  private String title;
  
  public String play() {
    System.out.println("PLAYING CD:  " + title);
    return title;
  }
}
