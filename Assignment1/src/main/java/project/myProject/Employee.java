package project.myProject;

import java.util.Map;

public class Employee {

	private Map<String,String> information;

	@Override
	public String toString() {
		return "employee [information=" + information + "]";
	}
	public void printMap()
    {
        for (Map.Entry<String, String> info :
             information.entrySet()) {
 
            System.out.println(
                "Employee Id :" + info.getKey() + " & "
                + "Employee Name :" + info.getValue());
        }
    }
	public Employee(Map<String, String> information) {
		super();
		this.information = information;
	}
	
	
}
