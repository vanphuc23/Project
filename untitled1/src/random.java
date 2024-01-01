import java.util.Random;
public class random {
    public static void main(String[] args) {
        int c = 0;
        int count = 0;
        Random rand = new Random();
        while (c != 7) {
            int a = (int) (Math.random()*6)+1;
            int b = (int) (Math.random()*6)+1;
            c = a + b;
           count++;
            System.out.println(a + "+" + b + " = " + c);
      }
        System.out.println("You want after " + count + " tries");
    }
}
