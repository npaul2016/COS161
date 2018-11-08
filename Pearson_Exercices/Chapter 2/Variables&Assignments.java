
public class VariableExample {

    public static void main(String[] args) {
        int x = 2 + 2;
        int y = 2 * x;
        int z = y - x - 1;
        y--;
        x++;
        System.out.println("x = " + x);
        System.out.println("y = " + x);
        System.out.println("z = " + x);

        x*= y;
        x *= z;
        y = x / y / z;
        z = x / y / z;
        x = x / y / z;

        System.out.println("x= " + x);
        System.out.println("y= " + x);
        System.out.println("z= " + x);


    }

}
