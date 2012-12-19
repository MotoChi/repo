package springapp.web;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import springapp.service.SimpleProductManager;

public class InventoryControllerTests {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testHandleRequestView() throws Exception {
    InventoryController controller = new InventoryController();
    controller.setProductManager(new SimpleProductManager());
    ModelAndView modelAndView = controller.handleRequest(null, null);
    assertEquals("hello", modelAndView.getViewName());
    assertNotNull(modelAndView.getModel());
    @SuppressWarnings("unchecked")
    Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
    String nowValue = (String) modelMap.get("now");
    assertNotNull(nowValue);
  }
}
