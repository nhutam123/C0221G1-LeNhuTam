package bai16_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OptionalThucHanh {
    public void readFileText(String filePath) {
        try {
            File file =new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=br.readLine()) != null ) {
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("tong = "+sum);
        }catch (Exception e){
            System.out.println("file khong ton tai hoac noi dung loi");

        }
    }

    public static void main(String[] args) {
        System.out.println("nhap duong dan file");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        OptionalThucHanh optionalThucHanh=new OptionalThucHanh();
        optionalThucHanh.readFileText(path);
    }
}
