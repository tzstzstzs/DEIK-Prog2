import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        try {
            //System.out.println(5 / 0);
            Scanner sc = new Scanner(new File("input.txt"));
            System.out.println("Fájl megnyitva");
            System.out.println("alma".charAt(10));
            System.out.println(new int[]{1, 2, 3}[10]);
        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem létezik!");
        } catch (ArithmeticException e) {
            System.out.println("Nullával való osztás!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Túl nagy index a sztringben!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Túl nagy index");
        } finally {
            System.out.println("A kód lefutott!");
        }
    }
}
