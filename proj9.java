public class Problem9

{
  public static void main(String[] args)
  {
    double c;
    int cFloor;
    for (int a = 1; a <=500; a++)
    {
      for (int b = a+1; b <= 500; b++)
      {
        c = Math.sqrt((a*a) + (b*b));
        cFloor = (int)c;
        if(c - cFloor == 0 && a+b+c == 1000)
        {
          System.out.println("The desired pythagorean triplet is: " + a + "," + b + "," + cFloor);
          System.out.println("The product abc is " + a*b*c);
        }
else
        {
          continue;
        }
      }
    }
  }
}
