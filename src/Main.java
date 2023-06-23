import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add("Цадкин", "Мирослав", "Викторович", 1, 100000);
        employeeBook.add("Ласынов", "Тимур", "Ильгизович", 2, 200000);
        employeeBook.add("Симаков", "Дмитрий", "Александрович", 3, 140000);
        employeeBook.add("Коростылев", "Сергей", "Святославович", 4, 210000);
        employeeBook.add("Иванов", "Евгений", "Валерьевич", 5, 80000);
        employeeBook.add("Штефан", "Виктор", "Викторович", 3, 90000);
        employeeBook.add("Параничев", "Александр", "Витальевич", 4, 65000);
        employeeBook.add("Полякова", "Римма", "Степановна", 5, 24000);
        employeeBook.add("Ильин", "Евгений", "Николаевич", 3, 132500);
        employeeBook.add("Попко", "Антон", "Игоревич", 4, 55250);
        employeeBook.salaryChange("Цадкин","Мирослав","Викторович",4,200000);
        employeeBook.toStringForAll();
        employeeBook.departmentToStringForAll(1);
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.averageSalary();
        employeeBook.indexedSalary(33);
        employeeBook.minSalaryDepartment(3);
        employeeBook.maxSalaryDepartment(4);
        employeeBook.costAmountDepartment(5);
        employeeBook.averageSalaryDepartment(5);
        employeeBook.departmentIndexSalary(1,20);
        employeeBook.departmentToStringForAll(2);
        employeeBook.lessSalary();
        employeeBook.moreSalary();
        employeeBook.deleteId(3);
        employeeBook.toStringForAll();











    }

}