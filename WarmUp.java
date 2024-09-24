public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(3));
    System.out.println(isDivisible(4,3));
  }

  public static boolean isEven(int x){
    x%=2;
    if (x == 0){
      return true;
    }
    return false;
  }

  public static boolean isDivisible(int a, int b){
    a%=b;
    if (a == 0){
      return true;
    }
    return false;
  }
}
