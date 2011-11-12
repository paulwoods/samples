package com.habuma.spring.xmlsucks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoundSystemConfig {
  @Bean
  public Player player() {
    Player player = new Player(speakers());
    player.setMedia(compactDisc());
    return player;
  }
  
  @Bean
  public Media compactDisc() {
    return new CompactDisc("Rattle and Hum");
  }
  
  @Bean
  public OutputDevice speakers() {
    return new Speakers();
  }
}
