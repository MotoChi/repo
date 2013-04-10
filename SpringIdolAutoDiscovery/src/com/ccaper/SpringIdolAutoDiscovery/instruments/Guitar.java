package com.ccaper.SpringIdolAutoDiscovery.instruments;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
  public Guitar() {
  }
  
  @Override
  public void play() {
    System.out.println("STRUM STRUM STRUM");
  }
}
