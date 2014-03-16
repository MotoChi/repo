package JacksonExample;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

public class JacksonExample {
  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
    Address address = new Address("4106 N. Monticello Ave", "Chicago", "IL",
        "606018");
    PhoneNumber personalCell = new PhoneNumber("personal cell", "773-395-9640");
    PhoneNumber workCell = new PhoneNumber("work cell", "312-248-9999");
    Person christian = new Person("Christian", "Caperton", 41, address, new PhoneNumber[]{personalCell, workCell});
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(Visibility.ANY));
    String json = mapper.writeValueAsString(christian);
    System.out.println("Json: " + json);
    Person jsonPerson = mapper.readValue(json, Person.class);
    System.out.println("Java Object: " + jsonPerson);
  }
}
