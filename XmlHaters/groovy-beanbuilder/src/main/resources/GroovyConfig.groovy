beans {
  speakers(com.habuma.spring.xmlsucks.Speakers)

  cd(com.habuma.spring.xmlsucks.CompactDisc, "Rattle and Hum")
  
  player(com.habuma.spring.xmlsucks.Player, speakers) {
    media = cd
  }
}
    