import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilTest {

    @org.junit.jupiter.api.Test
    void fileWriter() {
        File fileToWrite = new File("C:\\Users\\user\\Desktop\\Write This.txt");
        if(fileToWrite.exists())fileToWrite.delete();
        assertTrue(!fileToWrite.exists());
        FileUtil.fileWriter("Just a unit test",fileToWrite);
        fileToWrite.delete();

    }

    @org.junit.jupiter.api.Test
    void fileReader() {
        String expected = "Reading this line one time\nReading this file one more time\n";
        String actual = FileUtil.fileReader(new File("C:\\Users\\user\\Desktop\\Read This.txt"));
        assertEquals(expected, actual);
    }
}