package springapp.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import springapp.domain.Product;

public class SimpleProductManagerTests {
  private SimpleProductManager productManager;
  private List<Product> products;
  private static int PRODUCT_COUNT = 2;
  private static double CHAIR_PRICE = new Double(20.50);
  private static String CHAIR_DESCRIPTION = "Chair";
  private static String TABLE_DESCRIPTION = "Table";
  private static double TABLE_PRICE = new Double(150.10);
  private static int POSITIVE_PRICE_INCREASE = 10;

  @Before
  public void setUp() throws Exception {
    productManager = new SimpleProductManager();
    products = new ArrayList<Product>();

    // stub up a list of products
    Product product = new Product();
    product.setDescription(CHAIR_DESCRIPTION);
    product.setPrice(CHAIR_PRICE);
    products.add(product);

    product = new Product();
    product.setDescription(TABLE_DESCRIPTION);
    product.setPrice(TABLE_PRICE);
    products.add(product);

    productManager.setProducts(products);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGetProductsWithNoProducts() throws Exception {
    productManager = new SimpleProductManager();
    assertNull(productManager.getProducts());
  }

  @Test
  public void testGetProducts() throws Exception {
    List<Product> products = productManager.getProducts();
    assertNotNull(products);
    assertEquals(PRODUCT_COUNT, productManager.getProducts().size());

    Product product = products.get(0);
    assertEquals(CHAIR_DESCRIPTION, product.getDescription());
    assertEquals(CHAIR_PRICE, product.getPrice(), 0);

    product = products.get(1);
    assertEquals(TABLE_DESCRIPTION, product.getDescription());
    assertEquals(TABLE_PRICE, product.getPrice(), 0);
  }

  @Test
  public void testIncreasePriceWithNullListOfProducts() throws Exception {
    try {
      productManager = new SimpleProductManager();
      productManager.increasePrice(POSITIVE_PRICE_INCREASE);
    } catch (NullPointerException ex) {
      fail("Products list is null.");
    }
  }

  @Test
  public void testIncreasePriceWithEmptyListOfProducts() throws Exception {
    try {
      productManager = new SimpleProductManager();
      productManager.setProducts(new ArrayList<Product>());
      productManager.increasePrice(POSITIVE_PRICE_INCREASE);
    } catch (Exception e) {
      fail("Products list is empty.");
    }
  }

  @Test
  public void testIncreasePriceWithPositivePercentage() throws Exception {
    productManager.increasePrice(POSITIVE_PRICE_INCREASE);
    double expectedChairPriceWithIncrease = 22.55;
    double expectedTablePriceWithIncrease = 165.11;

    List<Product> products = productManager.getProducts();
    Product product = products.get(0);
    assertEquals(expectedChairPriceWithIncrease, product.getPrice(), 0);

    product = products.get(1);
    assertEquals(expectedTablePriceWithIncrease, product.getPrice(), 0);
  }
}
