package com.Booking.Model;

public class Student {
     private int no;
     private String name;
     private String password;
     private String phone;
     private String district;
     private String username;
     private String email;
     
     public int getNo(){
    	 return no;
     }
     
     public void setNo(int no){
    	 this.no = no;
     }
     
     public String getName(){
    	 return name;
     }
     
     public void setName(String name){
    	 this.name = name;
     }
     
     public void setPassword(String password){
    	 this.password = password;
     }
     
     public String getPassword(){
    	 return password;
     }
     
     public String getPhone(){
    	 return phone;
     }
     
     public void setPhone(String phone){
    	 this.phone = phone;
     }
     
     public String getUsername(){
    	 return username;
     }
     
     public void setUsername(String username){
    	 this.username = username;
     }
     
     public String getEmail(){
    	 return email;
     }
     
     public void setEmail(String email){
    	 this.email = email;
     }
     
     public String getDistrict(){
    	 return district;
     }
     
     public void setDistrict(String district){
    	 this.district = district;
     }
}
