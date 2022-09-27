import java.io.*;

public class FileUtil {
    //File writer
    public static void fileWriter(String textForFile, File fileToWrite) {

        try {
            if(!fileToWrite.exists()){
                fileToWrite.createNewFile();
            }
            FileWriter fw = new FileWriter(fileToWrite);
            fw.write(textForFile);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //File reader
    public static String fileReader(File file){
        String contentFromFile = "";
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader(file));

            while ((strCurrentLine = objReader.readLine()) != null) {

                contentBuilder.append(strCurrentLine + "\n");
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        contentFromFile = contentBuilder.toString();
        return contentFromFile;
    }


}




