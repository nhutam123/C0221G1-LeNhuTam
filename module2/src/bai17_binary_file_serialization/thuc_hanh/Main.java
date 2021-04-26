package bai17_binary_file_serialization.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        InputStream is =null;
        OutputStream os=null;
        try{
            is=new FileInputStream(source);
            os=new FileOutputStream(dest);
            byte[] buffer=new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("nhap sai");
        } finally {
            is.close();
            os.close();
        }

    }
    private void copyFileUsingStream(File source,File dest){

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter source file: ");
        String sourcePath=scanner.nextLine();
        System.out.println("enter dextination file: ");
        String destFile =scanner.nextLine();
        File sourceFile=new File(sourcePath);
        File destfile=new File(destFile);
        try {
            copyFileUsingJava7Files(sourceFile,destfile);
            System.out.println("copy completed ");
        }catch (Exception ioe){
            System.out.println("can't copy that file ");
            System.out.println(ioe.getMessage());
        }
    }
}
