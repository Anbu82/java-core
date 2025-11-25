package anbu.oops;
import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        // 1️⃣ Create a file
        createFile();

        // 2️⃣ Write text to the file
        writeToFile();

        // 3️⃣ Read text from the file
        readFromFile();

        // 4️⃣ Copy the file using byte array (FASTEST)
        copyFile();
    }

    // ---------------------------------------------------
    // 1️⃣ CREATE FILE
    // ---------------------------------------------------
    private static void createFile() {
        File file = new File("mydata.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("Create File Error: " + e.getMessage());
        }
    }

    // ---------------------------------------------------
    // 2️⃣ WRITE TO FILE (BufferedWriter - FAST)
    // ---------------------------------------------------
    private static void writeToFile() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("mydata.txt"))) {

            bw.write("Hello Anbu!");
            bw.newLine();
            bw.write("This is file handling in Java.");
            bw.newLine();
            bw.write("Writing completed.");

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }

    // ---------------------------------------------------
    // 3️⃣ READ FROM FILE (BufferedReader)
    // ---------------------------------------------------
    private static void readFromFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("mydata.txt"))) {

            System.out.println("\nReading the file:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }

    // ---------------------------------------------------
    // 4️⃣ COPY FILE (BufferedInputStream + BufferedOutputStream)
    // ---------------------------------------------------
    private static void copyFile() {

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mydata.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mydata_copy.txt"))
        ) {

            byte[] buffer = new byte[4096];  // 4 KB buffer
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("\nFile copied successfully!");

        } catch (IOException e) {
            System.out.println("Copy Error: " + e.getMessage());
        }
    }
}
