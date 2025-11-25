package anbu.oops;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("test.txt");

        try {
            // create a file
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }
            /*way to append text
             * try(FileWriter writer = new FileWriter("test.txt",true)){
             * writer.write("\n Appending new text...")
             * }
             */

            /* File writing with BufferWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
            for (int i=0;i<10000;i++){
            bw.write("Hello");
            bw.newLine();
            }
            bw.close();
             */


            //write into that file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Anbu\n");
            writer.write("This is my first file");
            writer.close();

            System.out.println("Writing Completed");
        }
        catch(IOException e){
               System.out.println("Error :"+ e.getMessage());
            }

        }
    }

