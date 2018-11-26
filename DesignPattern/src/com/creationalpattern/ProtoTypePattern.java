package com.creationalpattern;

import java.util.List;

public class ProtoTypePattern
{
public static void main(String[] args) throws CloneNotSupportedException
{
	System.out.println("prototype pattern example");
	Employee employee=new Employee();
	employee.loadData();
	Employee emp1=(Employee) employee.clone();
	Employee emp2=(Employee) employee.clone();
	List<String> list=emp1.getList();
	List<String> list1=emp2.getList();
	list.add("kumar");
	list1.remove("aman");
	System.out.println("employee original list "+employee.getList());
	System.out.println("copy object using clone");
	System.out.println(list);
	System.out.println(list1);
}
}
