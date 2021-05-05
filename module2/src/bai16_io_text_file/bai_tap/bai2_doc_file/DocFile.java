package bai16_io_text_file.bai_tap.bai2_doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DocFile {
    public static void main(String[] args) {
       DocFile docFile=new DocFile();
       ArrayList arrayList=readFile("src\\bai16_io_text_file\\thuc_hanh\\text1");
       for (int i=0;i<arrayList.size();i++){
           System.out.println(arrayList.get(i));
       }

    }
     public static ArrayList<String> readFile(String fileCopy){
        ArrayList<String> arrayList=new ArrayList<>();
        try{
            File file=new File(fileCopy);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader=new FileReader(file);
            BufferedReader br=new BufferedReader(fileReader);
            String line="";
            while ((line=br.readLine()) != null){
                String quocGia=line.split(",")[5];
                arrayList.add(quocGia);
            }

        }catch (Exception e){
            System.out.println("file khong ton tai");
        }
        return arrayList;
    }
}
