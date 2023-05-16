import java.io.*;

class Employee 
{
    private int id;
    private String name;
    private String dept;
    private double salary;

    Employee()
    {
        id=000;
        name="NULL";
        dept="NULL";
        salary=0.0;
    }

    Employee(int id,String name,String dept,double salary)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    void accept()throws Exception
    {
        System.out.println("Enter the employee details");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the id of the employee");
        id = Integer.parseInt(br.readLine());

        
        System.out.println("Enter the name of the employee");
        name = br.readLine();

        
        System.out.println("Enter the dept of the employee");
        dept = br.readLine();

        
        System.out.println("Enter the salary of the employee");
        salary = Double.parseDouble(br.readLine());

        
    }

    double getsal()
    {
        return salary;
    }

    void display()
    {
        System.out.println(id+" "+name+" "+dept+" "+salary);
    }
}

class Manager extends Employee 
{
    private double bonus;

    Manager()
    {
        super();
        bonus=0;
    }

    Manager(int id,String name,String dept,double salary,double bonus)
    {
        super(id,name,dept,salary);
        this.bonus=bonus;
    }

    void accept()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.accept();
        System.out.println("Enter the bonus of the manager");
        bonus = Double.parseDouble(br.readLine());

    }

    void display()
    {
        super.display();
        System.out.println("bonus :"+bonus);
        System.out.println("Total salary :"+(bonus+getsal()));
    }

}

public class EmployeManagerDemo{
    public static void main(String args[])throws Exception
    {
        Manager m1 = new Manager();

        m1.accept();
        m1.display();
    }
}