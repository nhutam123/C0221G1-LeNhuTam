package functions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddEditDeleteSearch {
    Scanner scanner=new Scanner(System.in);
    String id;
    ArrayList<String> list=new ArrayList<>();
    public void input(){
        try{
            System.out.println("nhập id của sản phẩm: ");
            String idRegex="";
            String idIput=scanner.nextLine();
            if (regexInput(id,idRegex)){
                id=idIput;
            }
            throw new CreateEception("lỗi rồi nha");
        } catch (CreateEception createEception) {
            createEception.printStackTrace();
        }


    }

    public boolean regexInput(String string,String regex){
        Pattern pattern=Pattern.compile(string);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
    public void writeFile(String pathFile,ArrayList list) {
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
        public List<String> readFile (String pathFile){
            ArrayList<String> list = new ArrayList<>();
            String line = "";
            try {
                File file = new File(pathFile);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                if ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("không tìm tháy file");
            } catch (Exception e) {
                e.getMessage();
            }
            return list;
        }
        public void delete(String id,String pathFile){
        List<String> list=readFile(pathFile);
        int count=0;
        System.out.println("bạn có muốn xóa đối tượng trên không: \n" +
                "1. ok\n" +
                "2. cancel");
        int choose=0;
        try {
            choose=Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            e.getMessage();
        }
        if (choose==1){
            for (int i=0;i<list.size();i++){
                if (list.get(i).split(",").equals(id)){
                    list.remove(list.get(i));
                    count++;
                }
            }
            if (count==0){
                System.out.println("không tìm thấy : ");
            }
        }
    }
    public void showInfo(){

    }

    @Override
    public String toString() {
        return "AddEditDeleteSearch{" +
                "id='" + id + '\'' +
                '}';
    }
}