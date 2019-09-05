
public class Contacts {
	//attributes
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String company;
	private String jobTitle;
	private String businessAddress;
	private String phoneNumber;
	
	//constructor
	public Contacts(String title, String firstName, String middleName, String lastName, String company, String jobTitle, String businessAddress, String phoneNumber) {
		setTitle(title);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setCompany(company);
		setJobTitle(jobTitle);
		setBusinessAddress(businessAddress);
		setPhoneNumber(phoneNumber);
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//getters
	public String getTitle() {
		return title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getBusinessAddress() {
		return businessAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
