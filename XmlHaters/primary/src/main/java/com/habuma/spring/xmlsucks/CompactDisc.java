package com.habuma.spring.xmlsucks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CompactDisc implements Media {
  @Value("#{systemEnvironment['SONG']}")
  private String title;
  
  public String play() {
    System.out.println("PLAYING CD:  " + title);
    return title;
  }
}
