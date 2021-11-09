package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
System.out.println("empName");

	}
	public static void main(String[] args) {
		Employee x=new Employee();
		x.empName();
		Company y=new Company();
		y.companyName();
		Client l=new Client();
		l.clientName();
		Project p=new Project();
		p.projectName();
	}

}
