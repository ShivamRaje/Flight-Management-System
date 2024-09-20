package model;

import java.util.Date;

public class User {
	
private long userId;
private String userName;
private String userPassword;
private String userType;
private String userAddress;
private long userPhone;
private Date userDob;
private String gender;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(long userId, String userName, String userPassword, String userType, String userAddress, long userPhone,
		Date userDob, String gender) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userType = userType;
	this.userAddress = userAddress;
	this.userPhone = userPhone;
	this.userDob = userDob;
	this.gender = gender;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public long getUserPhone() {
	return userPhone;
}
public void setUserPhone(long userPhone) {
	this.userPhone = userPhone;
}
public Date getUserDob() {
	return userDob;
}
public void setUserDob(Date userDob) {
	this.userDob = userDob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userType="
			+ userType + ", userAddress=" + userAddress + ", userPhone=" + userPhone + ", userDob=" + userDob
			+ ", gender=" + gender + "]";
}


}
