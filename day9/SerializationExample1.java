package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient public int eid;
	private String ename;
	private int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}

public class SerializationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Serialization
		Employee e1 = new Employee(101, "Rupika",20000);
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");		
		ObjectOutputStream objOut = new ObjectOutputStream(fout);
		objOut.writeObject(e1);
		objOut.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-serialization
		FileInputStream fin = new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objIn = new ObjectInputStream(fin);
		Employee emp = (Employee)objIn.readObject();
		objIn.close();
		fin.close();
		System.out.println(emp);
		
		
		
	}

}
