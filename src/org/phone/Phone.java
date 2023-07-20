package org.phone;

public class Phone {
private void phoneInfo(int b) {
	// TODO Auto-generated method stub
System.out.println("RAM : "+b);
}
private void phoneInfo(int c,long s) {
	// TODO Auto-generated method stub
System.out.println("Storage : "+c+"\nPin : "+s);
}
private void phoneInfo(long l,float f,String s,boolean b,char c) {
	// TODO Auto-generated method stub
	System.out.println("PH: "+l+"\npi value="+f+"\nPhone:"+s+"\nStatement is "+b+"\tType"+c);

}
private void mohanLogin() {
	// TODO Auto-generated method stub
System.out.println("This is done by  mohan");
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo(8);
	p.phoneInfo(64,5678);
	p.phoneInfo(96675678868l,3.14f,"Oneplus",true, 'C');
	p.mohanLogin();
	
}
}
