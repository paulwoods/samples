package com.habuma.spring.xmlsucks;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Player {
  private Media media;
  private OutputDevice outputDevice;
  
  @Inject
  public Player(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }
  
  @Inject
  @Named("compactDisc")
  public void setMedia(Media media) {
    this.media = media;
  }
  
  public void play() {
    outputDevice.emit(media.play());
  }
}
