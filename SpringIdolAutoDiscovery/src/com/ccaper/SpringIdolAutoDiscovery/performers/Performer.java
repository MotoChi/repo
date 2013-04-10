package com.ccaper.SpringIdolAutoDiscovery.performers;

import com.ccaper.SpringIdolAutoDiscovery.exceptions.PerformanceException;

public interface Performer {
  void perform() throws PerformanceException;
}
