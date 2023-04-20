package TEST;

public class Employee {

	//this will initialize the employee's personal data
	String Fname;
	String Lname;
	String Mname;
	int age;
	String gender;
	String dateOfB;
	String placeOfB;
	String religion;
	String civilStatus;
	
	//this will initialize the contant's information of employee
	String streetBrgy;
	String cityMunicipality;
	String province;
	String email;
	String contactNum;
	
	//this will initialize the employee's government id's information
	String sssNo;
	String tinNo;
	String pagibigNo;
	String philhealthNo;
	
	Employee (String Fname,String Lname,String Mname,int age,String gender,String dateOfB,String placeOfB,String religion,String civilStatus,String streetBrgy,String cityMunicipality,String province,String email,
	String contactNum,String sssNo,String tinNo,String pagibigNo,String philhealthNo){
		
		//This will give the access of global variable
		//Employee's Personal Data
		this.Fname = Fname;
		this.Lname = Lname;
		this.Mname = Mname;
		this.age = age;
		this.gender = gender;
		this.dateOfB = dateOfB;
		this.placeOfB = placeOfB;
		this.religion = religion;
		this.civilStatus = civilStatus;
		//Employee's Contact Information
		this.streetBrgy = streetBrgy;
		this.cityMunicipality = cityMunicipality;
		this.province = province;
		this.email = email;
		this.contactNum = contactNum;
		//Employee's GOVERMENT ID Information
		this.sssNo = sssNo;
		this.tinNo = tinNo;
		this.pagibigNo = pagibigNo;
		this.philhealthNo = philhealthNo;
	}
	public void displayEmployeeInfo() {
		//Prints out the Employee's Personal Data
	        	System.out.println("---------------------------------------------------------------------------\n" + 
						"PERSONAL DATA\n" + "---------------------------------------------------------------------------\n");
	        	System.out.println("Name: " + Fname + " " + Mname + " " + Lname);
	    		System.out.println("Age: " + age);
	    		System.out.println("Date of Birth: " + dateOfB);
	    		System.out.println("Place of Birth: " + placeOfB);
	    		System.out.println("Religion: " + religion);
	    		System.out.println("Civil Status: " + civilStatus);
	            System.out.println();
	            System.out.println("");
	   //Prints out the Employee's Contact Information
	        	System.out.println("---------------------------------------------------------------------------\n" + 
	    				"CONTACT INFORMATION\n" + "---------------------------------------------------------------------------\n");
	        	System.out.println("Address: " + streetBrgy + " " + cityMunicipality);
	    		System.out.println("Province: " + province);
	    		System.out.println("Email: " + email);
	    		System.out.println("");
	    		System.out.println("");
	  //Prints out the Employee's Goverment ID's Information
	        	System.out.println("---------------------------------------------------------------------------\n" + 
	    				"GOVERNMENT ID\n" + "---------------------------------------------------------------------------\n");
	        	System.out.println("SSS#: " + sssNo);
	    		System.out.println("TIN#: " + tinNo);
	    		System.out.println("PAGIBIG#: " + pagibigNo);
	    		System.out.println("PHILHEALTH: " + philhealthNo);
	    		System.out.println("");
	    		System.out.println("");
	}
	}

