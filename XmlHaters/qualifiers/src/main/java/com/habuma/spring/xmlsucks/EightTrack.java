package com.habuma.spring.xmlsucks;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oldSchool")
public class EightTrack implements Media {
  public String play() {
    System.out.println("8-Track playing");
    return "Hotel California";
  }
}
