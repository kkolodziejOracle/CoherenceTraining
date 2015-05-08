package com.oracle.coherence.model;

import java.util.Date;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Portable
public class Employee {
	
	public static final int EMPLOYEE_ID =0;
	public static final int COMMISSION_PCT = 1;
	public static final int DEPARTMENT_ID = 2;
	public static final int EMAIL =3;
	public static final int FIRST_NAME = 4;
	public static final int HIRE_DATE = 5;
	public static final int JOB_ID =6;
	public static final int LAST_NAME = 7;
	public static final int PHONE_NUMBER = 8;
	public static final int SALARY = 9;

@PortableProperty(EMPLOYEE_ID)
	private long employeeId;

@PortableProperty(COMMISSION_PCT)
	private Long commissionPct;

@PortableProperty(DEPARTMENT_ID)
    private Long departmentId;

@PortableProperty(EMAIL)
	private String email;

@PortableProperty(FIRST_NAME)
	private String firstName;

@PortableProperty(HIRE_DATE)
	private Date hireDate;

@PortableProperty(JOB_ID)
	private String jobId;

@PortableProperty(LAST_NAME)
	private String lastName;

@PortableProperty(PHONE_NUMBER)
	private String phoneNumber;

@PortableProperty(SALARY)
	private Long salary;


	public Employee() {
	}

	public long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(Long commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getSalary() {
		return this.salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

}