package com.habuma.spring.xmlsucks;


public class Player {
  private Media media;
  private OutputDevice outputDevice;
  
  public Player(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }
  
  public void setMedia(Media media) {
    this.media = media;
  }
  
  public void play() {
    outputDevice.emit(media.play());
  }
}
