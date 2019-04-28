package design;

import java.util.Scanner;

public class EmployeeInfo extends Abstract_employee {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
   private  static String companyName;
    private int employeeId;
    private String name;
   private  int salary;
   private int performance;
    private static String address;
    private  String department;



    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {
      this.employeeId=employeeId;

    }

    public EmployeeInfo(String name, int employeeId) {
           this.name=name; this.employeeId=employeeId;
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public String getCompanyName(){
        return companyName;
    }
    public int employeeId() {

        return this.employeeId;
    }
    public String employeeName() {

        return this.name;
    }
    public int getSalary(){
        return salary;
    }
    public int getPerformance(){
        return performance;
    }
    public String getAddress(){
        return address;
    }
    public String getDepartment(){
        return department;
    }
    //Setter
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public void setEmployeeId(int id){
        this.employeeId=id;
    }
    public  void setName(String name){
        this.name=name;
    }
    public void setPerformance(int performance){
        this.performance=performance;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setDepartment(String dep){
        this.department=dep;
    }
    public void assignDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter the name of the department");
        department= sc.nextLine();
    }
    public void assignDepartment(String department) {
        this.department=department;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int calculateSalary() {
        return super.calculateSalary();
    }

    public static int calculateEmployeeBonus( int salary , int performance) {

        int total = 0;
        if(performance>=10) total= ((int) (salary*.1))*12;
        else if(performance>=8) total= ((int) (salary*.08))*12;
        else if(performance >=5) total= ((int) (salary*.05))*12;

        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension(int salary) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): of ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        String start = convertedJoiningDate.substring(3,convertedJoiningDate.length());
        String actual = convertedTodaysDate.substring(3,convertedTodaysDate.length());
        int numberOfYear = Integer.parseInt(actual)-Integer.parseInt(start);

        //Calculate pension
         if(numberOfYear==1){
             total= (int) (salary*.05);

         }else if(numberOfYear==2){
             total = (int) (salary*.1);
         } else if(numberOfYear>=3){
             total = (int) (salary*.3);
         }

        return total;
    }


    private static class DateConversion {

        public DateConversion(Months months) {

        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
    public class nestedClass{
        public void display(){
            System.out.println("employee Info : ");
            System.out.println("name : "+name);
            System.out.println("ID : "+employeeId);
            System.out.println("company name :"+companyName);
            System.out.println("salary :"+salary);
            System.out.println("performance : "+performance);
            System.out.println("Address :  "+address);
            System.out.println("Department : "+department);
        }
    }
}
