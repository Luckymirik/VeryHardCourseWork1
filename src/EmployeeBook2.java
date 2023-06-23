//import java.util.Arrays;
//
//public class EmployeeBook2 {
//    public EmployeeBook2(Employee[] employees) {
//        this.employees = employees;
//    }
//
//    public EmployeeBook2() {
//    }
//
//     Employee[] employees = new Employee[10];
//
//    public void add(String name, String surname, String patronymic, int department, int salary) {
//        Employee newEmployee = new Employee(name, surname, patronymic, department, salary);
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] == null) {
//                employees[i] = newEmployee;
//                return;
//            }
//        }
//    }
//
//    public void toStringForAll() {
//        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
//        for (Employee b : employees) {
//            System.out.println(b);
//
//
//        }
//    }
//
//    public int costAmount() {
//        int sum = 0;
//
//        for (Employee employee : employees) {
//            if (employee != null) {
//                sum += employee.getSalary();
//            }
//        }
//        System.out.println("Cумма затрат на зарплаты в месяц " + sum);
//        return sum;
//    }
//
//    public int minSalary() {
//
//        Employee min = employees[0];
//        for (Employee employee : employees) {
//            if (employee != null) {
//                if (min.getSalary() > employee.getSalary()) {
//                    min = employee;
//
//
//                }
//            }
//        }
//        System.out.println("Сотрудник с минимальной зарплатой "+ min.getSalary()+" " +min.getName() + " " + min.getSurname());
//        return min.getSalary();
//    }
//    public int minSalary(int departmentNumber) {
//        System.out.println("В "+departmentNumber +" отделе ");
//Employee[] deparmentEmployees = department(departmentNumber);
//        Employee min = deparmentEmployees[0];
//        for (Employee employee : deparmentEmployees) {
//            if (employee != null) {
//                if (min.getSalary() > employee.getSalary()) {
//                    min = employee;
//
//
//                }
//            }
//        }
//        System.out.println("Сотрудник с минимальной зарплатой "+ min.getSalary()+" " +min.getName() + " " + min.getSurname());
//        return min.getSalary();
//    }
//    public  int maxSalary() {
//
//
//        Employee max = employees[0];
//
//
//        for (Employee employee : employees) {
//
//            if (max.getSalary() < employee.getSalary()) {
//                max = employee;
//
//
//            }
//        }
//
//        System.out.println("Сотрудник с максимальной зарплатой "+ max.getSalary()+" "+max.getName() + " " + max.getSurname());
//        return max.getSalary();
//    }
//    public  int averageSalary() {
//        for (Employee employee : employees) {
//            if (employee != null) {
//
//
//            }
//        }
//        return costAmount() / employees.length;
//    }
//    public  double indexedSalary(double g){
//        System.out.println("Проиндексированные зарплаты сотрудников по порядку:");
//        double ind = g/100+1;
//        double a =0;
//        for (Employee employee: employees) {
//            a = employee.getSalary()*ind;
//            System.out.println(a);
//
//        }
//        return a;
//    }
//    public  Employee[] department( int d) {
//        Employee[] l = new Employee[employees.length];
//        int index = 0;
//        for (Employee o : employees) {
//            if (o != null) {
//                if (o.getDepartment() == d) {
//                    l[index] = o;
//                    index++;
//                }
//            }
//
//        }
//
//        return Arrays.copyOf(l, index);
//
//    }
//
//
//
//}
