import junit.framework.TestCase;


public class MyLinkedListTest extends TestCase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  public void testNewLL() {
    MyLinkedList ll = new MyLinkedList();
    assertEquals(0, ll.size());
  }

  public void testSize() {
    MyLinkedList ll = new MyLinkedList();
    ll.add("1");
    assertEquals(1, ll.size());
    ll.add("2");
    assertEquals(2, ll.size());
    ll.remove(2);
    assertEquals(1, ll.size());
  }
}
