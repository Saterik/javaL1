// Работа с файлом, создание и запись в файл txt
import java.io.FileWriter;
import java.io.IOException;
public class FinalTXT {
    public static void main(String[] args0){
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
