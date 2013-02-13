import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListAsHashMap {
  private final List<List<anObject>> storage;

  public ArrayListAsHashMap() {
    storage = new ArrayList<List<anObject>>();
  }

  public boolean containsKey(String key) {
    for (List<anObject> buckets : storage) {
      for (anObject object : buckets) {
        if (key == null && object.getKey() == null) {
          return true;
        } else if (key.equals(object.getKey())) {
          return true;
        }
      }
    }
    return false;
  }

  public void put(String key, Integer value) {
    if (containsKey(key)) {
      for (List<anObject> bucket : storage) {
        for (anObject object : bucket) {
          if (key == null && object.getKey() == null) {
            object.setValue(value);
          } else if (key.equals(object.getKey())) {
            object.setValue(value);
          }
        }
      }
    } else {
      List<anObject> temp = new ArrayList<anObject>();
      temp.add(new anObject(key, value));
      storage.add(temp);
    }
  }

  public void remove(String key) {
    boolean found = false;
    List<anObject> tempBucket = null;
    anObject tempObject = null;
    for (List<anObject> bucket : storage) {
      for (anObject object : bucket) {
        if (key == null && object.getKey() == null) {
          tempBucket = bucket;
          tempObject = object;
          found = true;
        } else if (key.equals(object.getKey())) {
          tempBucket = bucket;
          tempObject = object;
          found = true;
        }
      }
    }
    if (found) {
      tempBucket.remove(tempObject);
      if (tempBucket.isEmpty()) {
        storage.remove(tempBucket);
      }
    }
  }

  public Set<String> keys() {
    Set<String> temp = new HashSet<String>();
    for (List<anObject> bucket : storage) {
      for (anObject object : bucket) {
        temp.add(object.getKey());
      }
    }
    return temp;
  }

  public List<Integer> values() {
    List<Integer> temp = new ArrayList<Integer>();
    for (List<anObject> bucket : storage) {
      for (anObject object : bucket) {
        temp.add(object.getValue());
      }
    }
    return temp;
  }

  @Override
  public String toString() {
    String result = "";
    for (List<anObject> bucket : storage) {
      for (anObject object : bucket) {
        result += object.getKey() + "=>" + object.getValue() + " ";
      }
    }
    return result.trim();
  }

  private class anObject {
    private final String key;
    private Integer value;

    public anObject(String key, Integer value) {
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public Integer getValue() {
      return value;
    }

    public void setValue(Integer value) {
      this.value = value;
    }

    @Override
    public boolean equals(Object that) {
      if (that == null && this == null) {
        return true;
      }
      if (this == that) {
        return true;
      }
      if (! (that instanceof anObject)) {
        return false;
      }
      anObject newThat = (anObject) that;
      return ((this.key == newThat.key) && (this.value == newThat.value));
    }

    @Override
    public int hashCode() {
      return 1;
    }
  }

  public static void main(String[] args) {
    ArrayListAsHashMap test = new ArrayListAsHashMap();
    System.out.println("Empty: " + test.toString());
    test.put("one", 1);
    System.out.println("One: " + test.toString());
    test.put("two", 2);
    System.out.println("Two: " + test.toString());
    test.put("three", 3);
    System.out.println("Three: " + test.toString());
    test.put("two", 10);
    System.out.println("Replace 2: " + test.toString());
    test.remove("two");
    System.out.println("After remove 2: " + test.toString());
    System.out.println("Keys: " + test.keys());
    System.out.println("Values: " + test.values());
  }
}
