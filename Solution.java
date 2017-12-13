import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {

  public static List<String> getLongestSequence(List<String> userA, List<String> userB) {
    // IMPLEMENTATION GOES HERE
    List<String> longestSequence = new ArrayList<>();
    int i = 0, j = 0, index = -1, maxLen = 0, currentLen = 0, currentStart = 0;
     //System.out.println("-----------------");
    while( i< userA.size())
    {
        j = 0;
        while( j < userB.size())
        {
            if(userA.get(i).equals(userB.get(j)))
            {
                //System.out.println("INDEX"+i+ "||"+ j);
                if(currentLen == 0)
                {
                    currentStart = i;
                }
                
                i++;
                j++;
                currentLen++;
              
                if(currentLen > maxLen)
                {
                    maxLen = currentLen;
                    index = currentStart;
                }
              
                if(j==userB.size())
                {
                  break;
                }
              
                if(i==userA.size())
                {
                  break;
                }
            }
            else
            {
                j++;
                currentLen = 0;
            }
        }
      
        i++;
    }
    
    if(maxLen == 0)
    {
      return new ArrayList<>();
    }
    
    for(i = currentStart; i < currentStart + maxLen; i++)
    {
        longestSequence.add(userA.get(i));
    }
    
    System.out.println(longestSequence);
    return longestSequence;
  }


  // START TEST CASES
  //
  // You can add test cases below. Each test case should be an instance of Test
  // constructed with:
  //
  // Test(String name, List<String> userA, List<String> userB, List<String> expectedOutput);
  //

  private static final List<Test> tests = Arrays.asList(
    new Test(
      // name
      "sample input #1",
      // userA
      Arrays.asList("/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"),
      // userB
      Arrays.asList("/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"),
      // expectedOutput
      Arrays.asList("/four.html", "/six.html", "/seven.html")
    ), 
    new Test(
      // name
      "sample input #2",
      // userA
      Arrays.asList("/one.html", "/two.html", "/three.html", "/four.html", "/six.html"),
      // userB
      Arrays.asList("/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"),
      // expectedOutput
      Arrays.asList("/two.html", "/three.html", "/four.html", "/six.html")
    ), 
    new Test(
      // name
      "sample input #3",
      // userA
      Arrays.asList("/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"),
      // userB
      Arrays.asList("/three.html", "/eight.html"),
      // expectedOutput
      Arrays.asList()
    ), 
    new Test(
      // name
      "sample input #4",
      // userA
      Arrays.asList("/one.html", "/two.html", "/three.html", "/four.html", "/six.html"),
      // userB
      Arrays.asList("/three.html", "/eight.html"),
      // expectedOutput
      Arrays.asList("/three.html")
    ),
    new Test(
      // name
      "sample input #5",
      // userA
      Arrays.asList(),
      // userB
      Arrays.asList("hello"),
      // expectedOutput
      Arrays.asList()
    ),
    new Test(
      // name
      "sample input #6",
      // userA
      Arrays.asList("/hello.html"),
      // userB
      Arrays.asList("/hello.html"),
      // expectedOutput
      Arrays.asList("/hello.html")
    )
  );


  // END TEST CASES
  // DO NOT MODIFY BELOW THIS LINE

  private static class Test {

    public String name;
    public List<String> userA;
    public List<String> userB;
    public List<String> expectedOutput;

    public Test(String name, List<String> userA, List<String> userB, List<String> expectedOutput) {
      this.name = name;
      this.userA = userA;
      this.userB = userB;
      this.expectedOutput = expectedOutput;
    }
  }

  private static boolean equalOutputs(List<String> a, List<String> b) {
    return a.equals(b);
  }

  public static void main(String[] args) {
    int passed = 0;
    for (Test test : tests) {
      try {
        System.out.printf("==> Testing %s...\n", test.name);
        List<String> actualOutput = getLongestSequence(test.userA, test.userB);
        if (equalOutputs(actualOutput, test.expectedOutput)) {
          System.out.println("PASS");
          passed++;
        } else {
          System.out.println("FAIL");
          System.out.printf("Expected output: %s\n", test.expectedOutput);
          System.out.printf("Actual output: %s\n", actualOutput);
        }
      } catch (Exception e) {
        System.out.println("FAIL");
        System.out.println(e);
      }
    }
    System.out.printf("==> Passed %d of %d tests\n", passed, tests.size());
  } 
}