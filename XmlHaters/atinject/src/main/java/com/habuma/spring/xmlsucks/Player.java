package com.habuma.spring.xmlsucks;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class Player {
  private Media media;
  private OutputDevice outputDevice;
  
  @Inject
  public Player(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }
  
  @Inject
  @OldSchool
  public void setMedia(Media media) {
    this.media = media;
  }
  
  public void play() {
    outputDevice.emit(media.play());
  }
}
