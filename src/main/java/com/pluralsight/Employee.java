package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

/*    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }*/


    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }
/*    public void punchIn(double time){
        punchInTime=time;
        System.out.println(name+" punched in at "+time);
    }
    public void punchOut(double time){
        hoursWorked+=(time-punchInTime);
        System.out.println(name+" punched out at "+time);
        System.out.println(name+" worked a total of "+hoursWorked+" hours during this paycheck");
    }*/

    public void punchTimeCard(double startTime,double endTime){
        hoursWorked+=(endTime-startTime);
        System.out.println(name+ "punched in at "+startTime);
        System.out.println(name+" punched out at "+endTime);
        System.out.println(name+" worked for "+(endTime-startTime)+" hours today");
        System.out.println(name+" worked a total of "+hoursWorked+" hours during this paycheck");

    }
}