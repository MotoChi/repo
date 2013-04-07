package com.ccaper.SpringIdolXml.instruments;

public class Harmonica implements Instrument {
  public Harmonica() {
    
  }
  
  @Override
  public void play() {
    System.out.println("HUM HUM HUM");
  }
}
