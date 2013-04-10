package com.ccaper.SpringIdolAutoDiscovery;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ccaper.SpringIdolAutoDiscovery.instruments.Instrument;
import com.ccaper.SpringIdolAutoDiscovery.performers.Instrumentalist;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("com.ccaper.SpringIdolAutoDiscovery.spring.spring-config.xml")
public class AnnotationConfigTest {
  @Autowired
  @Qualifier("eddie")
  private Instrumentalist eddie;

  @Autowired
  private Instrument guitar;

  @Test
  public void shouldWireWithAutowire() {
    assertNotNull(eddie.getInstrument());
    assertEquals(guitar, eddie.getInstrument());
  }
}
