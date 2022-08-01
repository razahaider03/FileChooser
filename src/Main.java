import java.io.File;

public class Main {
    public static void main(String[] args) {
        fileChoser f = new fileChoser();

        File[] files = f.chooseFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        
    }
}
