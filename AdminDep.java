
public class AdminDep extends CollegeAcc{
	private String studentAddress;
	private String studentEthnicity;
	private String studentGender;
	
	public AdminDep()
	{
		this(0,"","","","");
	}
	
	public AdminDep(int accNo, String name,String Address,String Ethnicity, String Gender)
	{
		super(accNo, name);
		this.studentAddress = Address;
		this.studentEthnicity = Ethnicity;
		this.studentGender = Gender;
		
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentEthnicity() {
		return studentEthnicity;
	}
	public void setStudentEthnicity(String studentEthnicity) {
		this.studentEthnicity = studentEthnicity;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setGender(String studentGender) {
		this.studentGender = studentGender;
	}

	@Override
	public String toString() {
		return "Administration Department [studentAddress=" + studentAddress + ", studentEthnicity=" + studentEthnicity
				+ ", studentGender=" + studentGender + "]";
	}
	
	
}

