package com.example.vinaymaneti.sample;

/**
 * Created by vinaymaneti on 3/20/16.
 */
public class OfficeEmployee {

    int employeeId;
    String employeename;
    EmployeeAddress employeeAddress;

    OfficeEmployee(int employeeId, String employeeName, EmployeeAddress employeeAddress) {
        this.employeeId = employeeId;
        this.employeename = employeeName;
        this.employeeAddress = employeeAddress;
    }

    void displayEmployeeInformation() {
        System.out.println(employeeId + " " + employeename + " " + employeeAddress.streetName + " " + employeeAddress.city + " " + employeeAddress.country);
    }

    public static void main(String args[]) {
        EmployeeAddress employeeAddress = new EmployeeAddress("Goutham Nagar", "Nizamabad", "India");
        EmployeeAddress employeeAddress1 = new EmployeeAddress("Vinayaka Nagar", "Nizamabad", "India");
        OfficeEmployee officeEmployee = new OfficeEmployee(111, "Vinay", employeeAddress);
        OfficeEmployee officeEmployee1 = new OfficeEmployee(222, "Kumar", employeeAddress1);


        officeEmployee.displayEmployeeInformation();
        officeEmployee1.displayEmployeeInformation();

    }

}
