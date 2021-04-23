package bai16_io_text_file.bai_tap.bai1_copy_file;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {
        CopyFile copyFile=new CopyFile();
        copyFile.copyFile();

    }
    public void copyFile(){
        writeFile("src\\bai16_io_text_file\\thuc_hanh\\text1",readFile("src\\bai16_io_text_file\\thuc_hanh\\text"));
    }
    public static ArrayList<String> readFile(String fileCopy){
        ArrayList<String> arrayList=new ArrayList<>();
        try{
            File file=new File(fileCopy);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine()) != null){
                arrayList.add(line);
            }

        }catch (Exception e){
            System.out.println("file khong ton tai");
        }
        return arrayList;
    }
    public  void writeFile(String file,ArrayList<String> arraylist){
        try{
            FileWriter writer=new FileWriter(file);
            String line="";
           for (int i=0;i<arraylist.size();i++){
               line = arraylist.get(i);
               writer.write(line);
               writer.append("\n");

           }
            writer.close();
        }catch (Exception e){
            System.out.println("ok");
        }
    }
}
