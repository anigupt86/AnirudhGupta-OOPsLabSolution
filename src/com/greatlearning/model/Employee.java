package com.greatlearning.model;

public class Employee {
	
		//DataMembers
		private String FirstName;
		private String LastName;
		private String Department;
		
		//Define Constructor
		public Employee (String FirstName, String LastName, String Department) {
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.Department = Department;
			
		}
		
		//Create getters and setters
		public String getFirstName() {
			return FirstName;
		}
		
		public void setFirstName(String FirstName) {
			this.FirstName  = FirstName;
		}
		
		public String getLastName() {
			return LastName;
		}
		
		public void setLastName(String LastName) {
			this.LastName  = LastName;
		}
		
		public String getDepartment() {
			return Department;
		}
		
		public void setDepartment(String Department) {
			this.Department  = Department;
		}


	
}
