package com.ccaper.SpringIdolXml.instruments;

public class Guitar implements Instrument {
  public Guitar() {
  }
  
  @Override
  public void play() {
    System.out.println("STRUM STRUM STRUM");
  }
}
