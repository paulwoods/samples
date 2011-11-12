package com.habuma.spring.xmlsucks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Player {
  private Media media;
  private OutputDevice outputDevice;
  
  @Autowired
  public Player(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }
  
  @Autowired
  @Qualifier("oldSchool")
  public void setMedia(Media media) {
    this.media = media;
  }
  
  public void play() {
    outputDevice.emit(media.play());
  }
}
