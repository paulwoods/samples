package com.habuma.spring.xmlsucks;

import javax.inject.Named;

@Named
@OldSchool
public class EightTrack implements Media {
  public String play() {
    System.out.println("8-Track playing");
    return "Hotel California";
  }
}
