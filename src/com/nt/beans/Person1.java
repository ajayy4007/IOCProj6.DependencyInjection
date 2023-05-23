package com.nt.beans;

public class Person1 {
	private int pid;
	private String pname;
	private String paddrs;
	private float income;

	public Person1(int pid, String pname, String paddrs, float income) {
		System.out.print("Person1::4 param/arg constructor");
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
	}
	
}
