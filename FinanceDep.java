
public class FinanceDep extends CollegeAcc{
	private int studentTuition; 
	private int studentUnsubloans; 
	private int studentSubloans; 
	private int studentScholarships;
	
	
	public FinanceDep()
	{
		this(0,"",0,0,0,0);
	}
	
	public FinanceDep(int accNo, String name,int tuition,int unsubloans, int subloans, int scholarships)
	{
		super(accNo, name);
		studentTuition = tuition;
		studentUnsubloans = unsubloans;
		studentSubloans = subloans;
		studentScholarships = scholarships;
	}
	
	public int getStudentTuition() {
		return studentTuition;
	}

	public void setStudentTuition(int studentTuition) {
		this.studentTuition = studentTuition;
	}

	public int getStudentUnsubloans() {
		return studentUnsubloans;
	}

	public void setStudentUnsubloans(int studentUnsubloans) {
		this.studentUnsubloans = studentUnsubloans;
	}

	public int getStudentSubloans() {
		return studentSubloans;
	}

	public void setStudentSubloans(int studentSubloans) {
		this.studentSubloans = studentSubloans;
	}

	public int getStudentScholarships() {
		return studentScholarships;
	}

	public void setStudentScholarships(int studentScholarships) {
		this.studentScholarships = studentScholarships;
	}
	
	public int finalAmount()
	{
		int finalAmount = studentTuition + studentUnsubloans + studentSubloans - studentScholarships;
		return finalAmount;
	}

	@Override
	public String toString() {
		return "Finance Department [studentTuition=" + studentTuition + ", studentUnsubloans=" + studentUnsubloans
				+ ", studentSubloans=" + studentSubloans + ", studentScholarships=" + studentScholarships + "]";
	}
	
	
}
