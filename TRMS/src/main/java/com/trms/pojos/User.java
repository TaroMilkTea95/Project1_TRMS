package com.trms.pojos;

public class User {

	private Integer userid;
	private Integer roleid;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private Integer reportsto;
	private int balance = 1000;
	private int pendingBalance = 0;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String password, String fullname) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = fullname;
	}
	
	public User() {
		super();
	}
	
	public User(Integer userid, Integer roleid, String username, String password, String email, String phone,
			Integer reportsto, int balance, int pendingBalance) {
		super();
		this.userid = userid;
		this.roleid = roleid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.reportsto = reportsto;
		this.balance = balance;
		this.pendingBalance = pendingBalance;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getReportsto() {
		return reportsto;
	}

	public void setReportsto(Integer reportsto) {
		this.reportsto = reportsto;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(int pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + pendingBalance;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((reportsto == null) ? 0 : reportsto.hashCode());
		result = prime * result + ((roleid == null) ? 0 : roleid.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (balance != other.balance)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pendingBalance != other.pendingBalance)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (reportsto == null) {
			if (other.reportsto != null)
				return false;
		} else if (!reportsto.equals(other.reportsto))
			return false;
		if (roleid == null) {
			if (other.roleid != null)
				return false;
		} else if (!roleid.equals(other.roleid))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", roleid=" + roleid + ", username=" + username + ", password=" + password
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone
				+ ", reportsto=" + reportsto + ", balance=" + balance + ", pendingBalance=" + pendingBalance + "]";
	}
}