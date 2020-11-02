package Task1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        try
        {
            FileReader fileReader = new FileReader("C:\\Users\\ohami\\IdeaProjects\\test\\PreparingForControlWork\\src\\Task1\\employees.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while(reader.ready()){
                EmployeeWithFixedPay employee = new EmployeeWithFixedPay();
                employee.setId(Integer.parseInt(reader.readLine()));
                employee.setName(reader.readLine());
                employee.setFixedMonthlyPay(Integer.parseInt(reader.readLine()));
                list.add(employee);
            }
            FileReader fileReader2 = new FileReader("C:\\Users\\ohami\\IdeaProjects\\test\\PreparingForControlWork\\src\\Task1\\employees2.txt");
            BufferedReader reader2 = new BufferedReader(fileReader2);
            while(reader2.ready()){
                EmployeeWithHourlyPay employee2 = new EmployeeWithHourlyPay();
                employee2.setId(Integer.parseInt(reader2.readLine()));
                employee2.setName(reader2.readLine());
                employee2.setRatePerHour(Integer.parseInt(reader2.readLine()));
                list.add(employee2);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list, new Sorting());
        for (int i = 0; i < list.size(); i++){
            System.out.println("Идентификатор работника: " + list.get(i).getId());
            System.out.println("Имя работника: " + list.get(i).getName());
            System.out.println("Среднемесячная зарплата работника: " + list.get(i).calculationSalary());
            System.out.println("\n");
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Имя работника: " + list.get(i).getName());
        }

        for (int i = (list.size()-3); i < list.size(); i++){
            System.out.println("Идентификатор работника: " + list.get(i).getId());
        }

        try(BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ohami\\IdeaProjects\\test\\PreparingForControlWork\\src\\Task1\\employeesResult.txt"))))
        {
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(String.valueOf(list.get(i).getId()));
                fileWriter.write("\n");
                fileWriter.write(list.get(i).getName());
                fileWriter.write("\n");
                fileWriter.write(String.valueOf((int) list.get(i).calculationSalary()));
                fileWriter.write("\n");
            }

            fileWriter.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
