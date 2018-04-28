package Java8.OptionalPractise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.Properties;
import org.junit.jupiter.api.Test;

/**
 * @author rituraj gupta
 */
public class ReadPositiveIntParam {

  /**
   * takes properties and it's key as string convert string to integer
   *
   * @return int
   */
  public static int readDurationImperative(Properties props, String name) {
    String value = props.getProperty(name);
    if (value != null) {
      try {
        int i = Integer.parseInt(value);
        if (i > 0) {
          return i;
        }
      } catch (NumberFormatException nfe) {
      }
    }
    return 0;
  }

  /**
   * takes string convert string to integer
   *
   * @return Optional<Integer>
   */
  public static Optional<Integer> s2i(String s) {
    try {
      return Optional.of(Integer.parseInt(s));
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
  }

  /**
   * @param props
   * @param name
   * @return
   */
  public static int readDurationWithOptional(Properties props, String name) {
    return Optional.ofNullable(props.getProperty(name))
        .flatMap(ReadPositiveIntParam::s2i)
        .filter(i -> i > 0)
        .orElse(0);
  }

  /**
   * testing
   */
  @Test
  public void testMap() {
    Properties props = new Properties();
    props.setProperty("a", "5");
    props.setProperty("b", "true");
    props.setProperty("c", "-3");

    assertEquals(5, readDurationImperative(props, "a"));
    assertEquals(0, readDurationImperative(props, "b"));
    assertEquals(0, readDurationImperative(props, "c"));
    assertEquals(0, readDurationImperative(props, "d"));

    assertEquals(5, readDurationWithOptional(props, "a"));
    assertEquals(0, readDurationWithOptional(props, "b"));
    assertEquals(0, readDurationWithOptional(props, "c"));
    assertEquals(0, readDurationWithOptional(props, "d"));
  }
}
