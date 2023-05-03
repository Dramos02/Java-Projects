package Polymorphism;

class Employee extends Company {
    private String department;
	private String employeeType;
    
    Employee(String Fname, String Lname, String Mname, String id, String streetBrgy, String cityMunicipality,  String province, String email,
    		String contactNum, int age, String sssNo, String tinNo, String pagibigNo, String philhealthNo, float basic, float incentivesPay, float houseRentAllowance, 
    		float mealAllowance, float providentFund, float professionalTax, float loan, float totalEarnings, float totalDeductions, float netPay, String department) {
        super(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
        		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {

    	
        this.department = department;
    }
    
    void employeeCode (int employeeCode) {
    	String employeeType = "";
		if (employeeCode == 1) {
			employeeType = "Employee";
			this.employeeType = employeeType;
		}
	}
    public void displayInfo() {
		System.out.println("\n--------------Employee Type: " + employeeType.toUpperCase() + "-------------------\n");
        super.displayInfo();
        System.out.println("Employee's Department: \t\t\t" + getDepartment()  + "\n");
    	System.out.println("---------------------------------------------------------\n");
        
    }
}