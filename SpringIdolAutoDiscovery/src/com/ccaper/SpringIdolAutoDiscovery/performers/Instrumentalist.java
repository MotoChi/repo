package com.ccaper.SpringIdolAutoDiscovery.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ccaper.SpringIdolAutoDiscovery.exceptions.PerformanceException;
import com.ccaper.SpringIdolAutoDiscovery.instruments.Instrument;

@Component("eddie")
public class Instrumentalist implements Performer {
  @Autowired
  private Instrument instrument;
  
  public Instrumentalist() {
  }
  
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  @Override
  public void perform() throws PerformanceException {
    instrument.play();
  }
}
