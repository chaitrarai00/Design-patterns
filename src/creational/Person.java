package creational;

public class Person {
	private int id;
	private String name;
	private String fathername;
	private String mothername;
	private String spousename;
	private String child;
	private boolean isMarried;
	private boolean haskid;
	private boolean isworking;
	private double salary;
	private String address;
	private String company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getSpousename() {
		return spousename;
	}
	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Person name(String name) {
		this.name=name;
		return this;
	}
	public Person Id(int id) {
		this.id=id;
		return this;
	}
	public Person fathername(String fathername) {
		this.fathername=fathername;
		return this;
	}
	public Person mothername(String mothername) {
		this.mothername=mothername;
		return this;
	}
	
	public Person address(String address) {
		this.address=address;
		return this;
	}
	/*
	 *Builders created
	 */
	public Person married(boolean ismarried) {
		this.isMarried=ismarried;
		return this;
	}
	
	public Person kids(boolean kid) {
		this.haskid=kid;
		return this;
	}

	public Person works(boolean works) {
		this.isworking=works;
		return this;
	}
	
	public Person spousename(String spousename) {
		this.spousename=spousename;
		return this;
	}
	
	
	public Person company(String company) {
		this.company=company;
		return this;
	}
	
	/*
	 * Diff checks for diff kind of objects
	 *without check
	 *for married
	 *for the one with kids
	 *for the one with a working status
	 */
	
	public Person build()  {
		return this;
	}
	
	public Person buildmarried()  {
		if(this.isMarried==true)
		{
			return this;
		}
		else {
			throw new IllegalArgumentException("not married");
		}
	}
	
	public Person buildkids()  {
		if(this.haskid==true)
		{
			return this;
		}
		else {
			throw new IllegalArgumentException("not married");
		}
	}
	
	public Person buildwork()  {
		if(this.isworking==true)
		{
			return this;
		}
		else {
			throw new IllegalArgumentException("not married");
		}
	}
	
}
