import java.util.Stack;



public class _Test {
  public static void main(String[] args)  {
      Solution solution = new Solution();


      
      // boolean isValid = solution.isValid("((");
      // boolean isValid = solution.isValid("([}}])");
      boolean isValid = solution.isValid("()[]{}");

      System.out.println(isValid);
  }

  
}
