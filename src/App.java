import java.lang.Math;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int s1 = 99, s2 = 99;
        float f1, f2;
        byte b = -10;
        boolean q = true;
        Random random = new Random();
        int min = 0, max = 10;

        s1 = (int)Math.pow(b, 2);
        s2 = random.nextInt(max - min + 1) + min;

        float MIN = 1, MAX = 9999;
        f2 = MIN + (MAX - MIN) * random.nextFloat();

        f1 = f2 / s1 * s2;

        System.out.println("Змiннiй s1 привласнити значення змiнної b, зведене у другий ступiнь: \ns1= "+ s1);
        System.out.println("\nЗмiннiй s2 привласнити випадкове значення в дiапазонi вiд 0 до 10: \ns2= "+ s2);
        System.out.println("\nЗмiннiй f2 привласнити випадкове значення в дiапазонi вiд 1 до 9999: \nf2= "+ f2);
        System.out.println("\nЗмiннiй f1 привласнити частку змiнних f2 та добутку s1 та s2: \nf1= "+ f1);

        System.out.println("\nОбрахувати та вивести на екран значення виразу:");
        System.out.println("y = " + (Math.tan(Math.pow(f1, s2)))/Math.log(s1));
    }
}
