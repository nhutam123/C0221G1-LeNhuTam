package functions;

import CaseStudy.models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddEditDeleteSearch {
    Scanner scanner=new Scanner(System.in);
    String id;
    ArrayList<Services> list=new ArrayList<>();
    public void input(){
        try{
            boolean check=false;
            do {
            System.out.println("nhập id của sản phẩm: ");
            String idRegex="";
            String idIput=scanner.nextLine();
            if (regexInput(id,idRegex)) {
                id = idIput;
                check=true;
            }
            }while (check==false);
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
    public void writeFile(String pathFile,List list) {
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
        public List<Object> changeObjectList(List<String> listString){
        List<Object> list=new ArrayList<>();
        int numberOfProperties=4;
        String[] array=new String[numberOfProperties];
        for (int i=0;i<listString.size();i++){

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
    public void searchEmployee(List<String> list,String name){
        for (int i=0;i<list.size();i++){
            if (list.get(i).split(",")[0].equals(name)){
                System.out.println(list.get(i));
            }else {
                System.out.println("không tìm thấy nhân viên: ");
            }
        }

    }
    // regex của tên có chữ cái đầu viết hoa.
    String regex="^([A-Z][a-z]{1,}[ ]{0,1})+";
    // regex birthDay ;
    String regex1="^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$";

    @Override
    public String toString() {
        return "AddEditDeleteSearch{" +
                "id='" + id + '\'' +
                '}';
    }
}