package com.acts.util;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.acts.emp.ContractEmployee;
import com.acts.emp.Employee;
import com.acts.emp.PermanentEmployee;
//Java 8 . Interface can have static methods
public interface DataUtils {
	public static Map<Integer, Employee> getTreeMap () throws ParseException {
//		Map<Integer, Employee> map = new TreeMap<>();
		Map<Integer, Employee> map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		Date date = DateUtils.getDate("07/12/2007", DateUtils.DD_MM_YYYY);
		Employee e1 = new PermanentEmployee("Dinesh", 
				"SW_ENGG", date, 13000,1000, 1000);
		
		
		Employee e2 = new PermanentEmployee("Vikas", 
				"SW_ENGG", date, 13000,1000, 1000);
		
		Employee e3 = new ContractEmployee("Ravi", 
				"TECH_LEAD", date, 1300,22);
		map.put(e3.getEmpId(), e3);
		map.put(e2.getEmpId(), e2);
		map.put(e1.getEmpId(), e1);
		
		return map;
		
	}

}
