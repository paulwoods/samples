package com.habuma.spring.xmlsucks;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


public class Player {
  private Media media;
  private OutputDevice outputDevice;
  
  @Autowired
  public Player(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }
  
  @Resource(name="eightTrack")
  public void setMedia(Media media) {
    this.media = media;
  }
  
  public void play() {
    outputDevice.emit(media.play());
  }
}
