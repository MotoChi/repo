package com.ccaper.SpringIdolXml.performers;

import com.ccaper.SpringIdolXml.exceptions.PerformanceException;
import com.ccaper.SpringIdolXml.instruments.Instrument;

public class Instrumentalist implements Performer {
  private String song;
  private Instrument instrument;
  
  public Instrumentalist() {
  }
  
  public void setSong(String song) {
    this.song = song;
  }
  
  public String getSong() {
    return song;
  }
  
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  @Override
  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }
}
