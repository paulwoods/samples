package com.habuma.spring.xmlsucks;

import org.springframework.stereotype.Component;

@Component
@OldSchool
public class EightTrack implements Media {
  public String play() {
    System.out.println("8-Track playing");
    return "Hotel California";
  }
}
