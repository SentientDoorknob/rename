import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("out_of_source.txt");

        if (file.exists()) {
            System.out.println("aha");
        }
        else {
            System.out.println("hmmm");
        }
    }
}