package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.List;
public class HIndex {
  // Given and array of positive integers, find the largest h such that there are at least h entires in
  // the array that are greater than or equal to h

  @EpiTest(testDataFile = "h_index.tsv")
  public static int hIndex(List<Integer> citations) {
    // TODO - you fill in here.
    return 0;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "HIndex.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
