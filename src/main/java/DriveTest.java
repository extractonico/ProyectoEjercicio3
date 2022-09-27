import java.io.File;

public class DriveTest {
    public static void main(String[] args) {

        //Call File writer
        File fileToWrite = new File("C:\\Users\\user\\Desktop\\Write This.txt");
        String contentToWrite = "Just a file";
        FileUtil.fileWriter(contentToWrite, fileToWrite);

        //Call File writer
        File fileToRead = new File("C:\\Users\\user\\Desktop\\Read This.txt");
        System.out.println(FileUtil.fileReader(fileToRead));


    }


}
