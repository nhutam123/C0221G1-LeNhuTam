package controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFunction {
    public IOFunction() {
    }

    public static void writeFile(String pathFile, List list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (int i = 0; i < list.size(); i++) {
                line = list.get(i).toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("t");
        }


    }

    public static ArrayList<String> readFile(String pathFile) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                // tạo đối tượng để add list đối tượng ở đây;
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (Exception e) {
            System.out.println("t");
        }
        return arrayList;
    }
}
