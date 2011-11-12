package com.habuma.spring.xmlsucks;


public class EightTrack implements Media {
  public String play() {
    System.out.println("8-Track playing");
    return "Hotel California";
  }
}
