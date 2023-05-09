package Polymorphism;

class Manager extends Company {
    private String team;
	private String deptCode;
	private String employeeType;
    
    Manager(String Fname, String Lname, String Mname, String id, String streetBrgy, String cityMunicipality,  String province, String email,
    		String contactNum, int age, String sssNo, String tinNo, String pagibigNo, String philhealthNo, float basic, float incentivesPay, float houseRentAllowance, 
    		float mealAllowance, float providentFund, float professionalTax, float loan, float totalEarnings, float totalDeductions, float netPay,
    		String team, String deptCode) {
        super(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
        		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay);
        this.team = team;
        this.deptCode = deptCode;
    }  
    public String getTeam() {
        return team;
    }
    
    public void setTeam(String team) {
        this.team = team;
    }
    
    public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {

		this.deptCode = deptCode;
	}

	void employeeCode (int employeeCode) {
    	String employeeType = "";
		if (employeeCode == 2) {
			employeeType = "Manager";
			this.employeeType = employeeType;
		}
	}
    public void displayInfo() {
    	System.out.println("\n--------------Employee Type: " + employeeType.toUpperCase() + "-------------------\n");
        super.displayInfo();
        System.out.println("Employee's Team: \t\t\t" + getTeam().toUpperCase());
        System.out.println("Employee's Deptcode: \t\t\t" + getDeptCode().toUpperCase() + "\n");
    	System.out.println("---------------------------------------------------------\n");
        
    }
	// Copyrights © https://github.com/Dramos02
}
