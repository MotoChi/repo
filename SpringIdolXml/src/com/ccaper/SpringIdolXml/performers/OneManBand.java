package com.ccaper.SpringIdolXml.performers;

import java.util.Collection;

import com.ccaper.SpringIdolXml.exceptions.PerformanceException;
import com.ccaper.SpringIdolXml.instruments.Instrument;

public class OneManBand implements Performer {
  private Collection<Instrument> instruments;
  
  public OneManBand() {
  }
  
  public void setInstruments(Collection<Instrument> instruments) {
    this.instruments = instruments;
  }
  
  @Override
  public void perform() throws PerformanceException {
    for (Instrument instrument : instruments) {
      instrument.play();
    }
  }
}
