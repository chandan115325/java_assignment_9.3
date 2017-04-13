
//an application having a Generic HashMap with Empcode as key and EmpName as value.
import java.util.*;
import java.util.Iterator;

public class EmployeHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap emp is created to store the emp_id as key and emp_name as value.
		HashMap<Integer,String>emp = new HashMap<Integer,String>();
		// array to store the keys in HashMap object
		int emp_id[] = {1,2,3};
		
		String emp_name[] ={"Chandan","Raja","Ravi"};
		
		//inserting keys and values in emp HashMap object
		for(int i=0 ;i<3;i++)
		{
			emp.put(emp_id[i], emp_name[i]);
		}
		//Dsplaying the output as emp_id and emp_name
		for(Map.Entry m:emp.entrySet()){  
			   System.out.println("employee id :"+m.getKey()+" "+"Employee name :"+m.getValue());  
			  }  
		//System.out.println(emp);
	}
}


