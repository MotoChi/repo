package springapp.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductTests {
  private Product product;

  @Before
  public void setUp() throws Exception {
    product = new Product();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSetAndGetDescription() throws Exception {
    String testDescription = "aDescription";
    assertNull(product.getDescription());
    product.setDescription(testDescription);
    assertEquals(testDescription, product.getDescription());
  }

  @Test
  public void testSetAndGetPrice() throws Exception {
    double testPrice = 100.00;
    assertEquals(0, 0, 0);
    product.setPrice(testPrice);
    assertEquals(testPrice, product.getPrice(), 0);
  }
}
