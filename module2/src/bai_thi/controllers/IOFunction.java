package bai_thi.controllers;


import bai_thi.models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFunction {
    public static void writeFile(String pathFile, List<DanhBa> list) {
        String line;
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                line = list.get(i).toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        }catch(FileNotFoundException e){
            System.out.println("không tìm thấy file: ");
        }catch(Exception e){
            e.getMessage();
        }

    }
    public static List<String> readFile (String pathFile){
        ArrayList<String> list = new ArrayList<>();
        String line = "";
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("không tìm tháy file");
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }
}
