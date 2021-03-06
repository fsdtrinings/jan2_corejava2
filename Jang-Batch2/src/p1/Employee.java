package p1;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String projectName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, String projectName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projectName = projectName;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("--->> inside hashcode , called for "+name);
		return id+name.length()+salary;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("--->> inside equals , called for "+name);
		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			
			boolean a = (this.id == e.id);
			boolean b = (this.name.equals(e.name));
			boolean c = (this.salary == e.salary);
			boolean d = (this.projectName.equals(e.projectName));
			
			return a&&b&&c&&d;
			
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return "id = "+id+" name :- "+name;
	}
	public void doOfficeWork()
	{
		
	}
}
