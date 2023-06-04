package com.greatlearning;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        String companyName = "greatlearning";
        Scanner input = new Scanner(System.in);

        String[] departments = new String[]{"Technical", "Admin", "Human Resource", "Legal"};
        int selectedDepartment = 1; //default department is technical
        boolean incorrectOptionFlag = true;
        while(incorrectOptionFlag){
            System.out.println("Please enter the department from the following");
            System.out.println("1. Technical");
            System.out.println("2. Admin");
            System.out.println("3. Human Resource");
            System.out.println("4. Legal");
            selectedDepartment = input.nextInt();
            if(selectedDepartment > 0 && selectedDepartment <= 4){
                incorrectOptionFlag = false;
            }else{
                System.out.println("Please select a valid department option!");
            }
        }

        System.out.println("Please enter your first name");
        String firstName = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        // using parameterized constructor to create employee
        Employee employee1 = new Employee(firstName, lastName);

        CredentialService credentialService = new CredentialService();

        // perform necessary functions
        credentialService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), departments[selectedDepartment-1], companyName);
        credentialService.generatePassword();
        credentialService.showCredentials(employee1.getFirstName());
    }
}
