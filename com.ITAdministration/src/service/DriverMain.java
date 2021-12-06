package service;

import java.util.Scanner;

import model.Employee;

public class DriverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();

		System.out.println("Enter last name : ");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical ");
		System.out.println("2. Admin ");
		System.out.println("3. Human Resource ");
		System.out.println("4. Legal ");

		int option = sc.nextInt();
		CredentialService cs = new CredentialService();

		String generateEmail;
		char[] generatePassword;

		if (option == 1) {
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		} else if (option == 2) {
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		} else if (option == 3) {
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "HR");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		} else if (option == 4) {
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		} else {
			System.out.println("enter valid option");
		}
	}

}
