package com.ccaper.SpringIdolXml.instruments;

public class Cymbal implements Instrument {
  public Cymbal() {
  }
  
  @Override
  public void play() {
    System.out.println("CRASH CRASH CRASH");
  }
}
