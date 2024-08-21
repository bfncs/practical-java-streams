package us.byteb.practical.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

/** Use Streams to fix all these tests for fun and profit. */
class StreamsTest {

  /** Count the number of strings that have length greater than 5 */
  @Test
  void countStrings() {
    final List<String> fruits = List.of("apple", "banana", "grape", "kiwi", "orange", "watermelon");

    // TODO: change this line only
    final long result = 0;

    assertEquals(4, result);
  }

  /** Transform a list of integers to a list of the squares of these integers */
  @Test
  void squareNumbers() {
    final List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    // TODO: change this line only
    final List<Integer> result = List.of();

    assertEquals(List.of(1, 4, 9, 16, 25), result);
  }

  /** Concatenate all string in a list into a single string */
  @Test
  void concatenateStrings() {
    final List<String> fruits = List.of("apple", "banana", "grape", "kiwi", "orange", "watermelon");

    // TODO: change this line only
    final String result = "";

    assertEquals("applebananagrapekiwiorangewatermelon", result);
  }

  /** Convert each string to uppercase and sort in alphabetical order */
  @Test
  void uppercaseAndSortStrings() {
    final List<String> fruits = List.of("watermelon", "apple", "orange", "banana", "grape", "kiwi");

    // TODO: change this line only
    final List<String> result = List.of();

    assertEquals(List.of("APPLE", "BANANA", "GRAPE", "KIWI", "ORANGE", "WATERMELON"), result);
  }

  /** Find the sum of all even numbers */
  @Test
  void sumEvenNumbers() {
    final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // TODO: change this line only
    final int result = 0;

    assertEquals(30, result);
  }

  /** Find the average of all numbers */
  @Test
  void averageNumbers() {
    final List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

    // TODO: change this line only
    final Double result = 0.0;

    assertEquals(3.0, result);
  }

  /** Remove all the duplicates from the list */
  @Test
  void uniqueStrings() {
    final List<String> fruits =
        List.of("apple", "banana", "apple", "grape", "kiwi", "orange", "banana", "watermelon");

    // TODO: change this line only
    final List<String> result = List.of();

    assertEquals(List.of("apple", "banana", "grape", "kiwi", "orange", "watermelon"), result);
  }

  /** Check if all numbers are even */
  @Test
  void checkAllNumbersEven() {
    final List<Integer> numbers = List.of(2, 4, 6, 8, 10);

    // TODO: change this line only
    final boolean allEven = false;

    assertTrue(allEven);
  }

  /** Check if the element 8 is contained in the list */
  @Test
  void checkNumbersContainElement() {
    final List<Integer> numbers = List.of(2, 4, 6, 8, 10);

    // TODO: change this line only
    final boolean contains8 = false;

    assertTrue(contains8);
  }

  /** Find the longest string */
  @Test
  void longestString() {
    final List<String> fruits =
        List.of("apple", "banana", "apple", "grape", "kiwi", "orange", "banana", "watermelon");

    // TODO: change this line only
    final String result = "";

    assertEquals("watermelon", result);
  }

  /** Find the largest salary by department */
  @Test
  void largestSalaryGroupedByDepartment() {
    record Employee(String name, String department, long salary) {}
    final Set<Employee> employees = Set.of(
            new Employee("Alice", "HR", 50_000),
            new Employee("Bob", "IT", 60_000),
            new Employee("Charlie", "Finance", 55_000),
            new Employee("David", "IT", 70_000),
            new Employee("Eva", "HR", 45_000),
            new Employee("Frank", "Finance", 57_000)
    );

    final Map<String, Double> largestSalaryByDepartment = Map.of();

    assertEquals(Map.of(
            "HR", 50_000L,
            "IT", 70_000L,
            "Finance", 57_000L
    ), largestSalaryByDepartment);
  }

}
