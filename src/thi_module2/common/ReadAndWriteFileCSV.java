package thi_module2.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    public static List<String> ReadFileCSV(String path){
        List<String> stringList= new ArrayList<>();
        File file =new File(path);
        try(FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader)){
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return  stringList;
    }
    public static void WriteFileCSV(String path,List<String> stringList, boolean append){
        File file= new File(path);
        try (FileWriter fileWriter =new FileWriter(file,append);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for(String string: stringList){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
