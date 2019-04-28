package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

     EmployeeInfo e = new EmployeeInfo("sonia",123);
     EmployeeInfo e2 = new EmployeeInfo(124);
     e.setSalary(e.calculateSalary());
     e.setAddress("Astoria");
     e.setPerformance(5);
     e2.setSalary(e.calculateSalary()+2000);
     e2.setName("rosh");
     e.setAddress("new jersey");
     e.setPerformance(10);
     System.out.println("let's calculate pernsion of employees");
     System.out.println("for "+e.employeeName());
     System.out.println(e.employeeName()+"'s pension is "+e.calculateEmployeePension(10000));
     //System.out.println("for "+e2.employeeName());
     //System.out.println(e2.employeeName()+"'s pension is "+e2.calculateEmployeePension(10000));
     //System.out.println("lets assign department for "+e.employeeName());
     //e.assignDepartment();

     System.out.println("lets calculate "+e.employeeName()+"'s bonus");
    int bonus = e.calculateEmployeeBonus(e.getSalary(),e.getPerformance());
    System.out.println(e.employeeName()+"'s bonus is : "+bonus);
    EmployeeInfo.nestedClass nested = e.new nestedClass();
    nested.display();
    EmployeeInfo.nestedClass nested2 = e2.new nestedClass();
    nested2.display();




	}

}
