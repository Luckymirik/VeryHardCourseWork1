import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void add(String name, String surname, String patronymic, int department, int salary) {
        Employee newEmployee = new Employee(name, surname, patronymic, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;

                return;
            }
        }
    }
//    public  Employee[] delete (int id) {
//
//        Employee[] l = new Employee[employees.length-1];
//
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] == null) {
//                employees[i] = l;
//
//
//            }
//        }
//
//
//
//
//
//        return l;
//
//
//    }
//public void deleteId(int id) {
//    for (int i = 0; i < employees.length; i++) {
//        if (employees[i] != null && employees[i].getId() == id) {
//            employees[i] = null;
//        }
//    }
//
//}

    public void deleteId(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }
    public void deleteName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i] = null;
            }
        }
    }
    public void salaryChange(String surname,String name,String patronymic,int newDepartment,int newSalary){
        for (int i = 0; i < employees.length; i++){
            if(employees[i].getName()==name && employees[i].getSurname()==surname&&employees[i].getPatronymic()==patronymic ){
                employees[i].setSalary(newSalary);
                employees[i].setDepartment(newDepartment);
            }
        }
    }










    public void toStringForAll() {
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee b : employees) {
            System.out.println(b);


        }
    }

    public int costAmount() {

        int sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }

        System.out.println("Cумма затрат на зарплаты в месяц " + sum);
        {
            return sum;
        }
    }

    public int minSalary() {

        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (min.getSalary() > employee.getSalary()) {
                    min = employee;


                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + min.getSalary() + " " + min.getName() + " " + min.getSurname());
        return min.getSalary();
    }

    public int maxSalary() {


        Employee max = employees[0];


        for (Employee employee : employees) {

            if (max.getSalary() < employee.getSalary()) {
                max = employee;


            }
        }

        System.out.println("Сотрудник с максимальной зарплатой " + max.getSalary() + " " + max.getName() + " " + max.getSurname());
        return max.getSalary();
    }

    public void averageSalary() {
        for (Employee employee : employees) {
            if (employee != null) {


            }
        }
        System.out.println("Средняя зароботная плата в месяц "+costAmount() / employees.length);

    }

    public double indexedSalary(double g) {
        System.out.println("Проиндексированные зарплаты сотрудников по порядку:");
        double ind = g / 100 + 1;
        double a = 0;
        for (Employee employee : employees) {
            a = employee.getSalary() * ind;
            System.out.println(a);

        }
        return a;
    }

    public Employee[] department(int d) {
        Employee[] l = new Employee[employees.length];
        int index = 0;
        for (Employee o : employees) {
            if (o != null) {
                if (o.getDepartment() == d) {
                    l[index] = o;
                    index++;
                }
            }

        }

        return Arrays.copyOf(l, index);

    }

    public int minSalaryDepartment(int departmentNumber) {
        System.out.println("В " + departmentNumber + " отделе ");
        Employee[] deparmentEmployees = department(departmentNumber);
        Employee min = deparmentEmployees[0];
        for (Employee employee : deparmentEmployees) {
            if (employee != null) {
                if (min.getSalary() > employee.getSalary()) {
                    min = employee;


                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + min.getSalary() + " " + min.getName() + " " + min.getSurname());
        return min.getSalary();
    }

    public int maxSalaryDepartment(int departmentNumber) {


        System.out.println("В " + departmentNumber + " отделе ");
        Employee[] deparmentEmployees = department(departmentNumber);
        Employee max = deparmentEmployees[0];
        for (Employee employee : deparmentEmployees) {
            if (employee != null) {
                if (max.getSalary() < employee.getSalary()) {
                    max = employee;


                }
            }
        }
            System.out.println("Сотрудник с максимальной зарплатой " + max.getSalary() + " " + max.getName() + " " + max.getSurname());
            return max.getSalary();
        }
    public int costAmountDepartment(int departmentNumber) {

        Employee[] departmentEmployees = department(departmentNumber);
        int sum = 0;

        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Cумма затрат на зарплаты в месяц по "+departmentNumber+" отделу " + sum);
        return sum;
    }
    public  void averageSalaryDepartment( int departmentNumber) {
        Employee[] departmentEmployees = department(departmentNumber);
        int sum = 0;

        for (Employee employee : departmentEmployees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Cумма затрат на зарплаты в месяц по "+departmentNumber+" отделу " + sum);
        System.out.println("Средняя зарплата по "+departmentNumber+"-му отделу "+sum/departmentEmployees.length);



    }
    public  void departmentIndexSalary( int departmentNumber,double indexPercent) {
        Employee[] departmentEmployees = department(departmentNumber);
        System.out.println(departmentNumber+"ый отдел");
        System.out.println("Проиндексированные зарплаты сотрудников по порядку:");
        double ind = indexPercent / 100 + 1;
        double a =0;
        for (Employee employee : departmentEmployees) {
            a = employee.getSalary() * ind;
            System.out.println(a);

        }

    }
    public  void departmentToStringForAll( int departmentNumber) {
        System.out.println(departmentNumber+" отдел");
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        Employee[] departmentEmployees = department(departmentNumber);
        for (Employee b : departmentEmployees) {
            System.out.println(b);


        }
    }
    public  void lessSalary() {
        System.out.println("Все сотрудники с зарплатой  меньше желательной:");
        int nSalary = 120000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < nSalary)
                System.out.println(employees[i].toString());


        }


    }
    public  void moreSalary() {
        System.out.println("Все сотрудники с зарплатой больше желательной:");
        int nSalary = 120000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > nSalary)
                System.out.println(employees[i].toString());
        }
    }
    }






