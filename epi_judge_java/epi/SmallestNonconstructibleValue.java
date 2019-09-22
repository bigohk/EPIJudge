package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.List;
public class SmallestNonconstructibleValue {
  // Given an array of positive integers, find the smallest number which is not the sum of a subset of
  // elements of the array

  @EpiTest(testDataFile = "smallest_nonconstructible_value.tsv")

  public static int smallestNonconstructibleValue(List<Integer> A) {
    // TODO - you fill in here.
    return 0;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "SmallestNonconstructibleValue.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
