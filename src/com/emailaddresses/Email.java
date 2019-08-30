package com.emailaddresses;

public class Email {
	static int countGmail;
	static int countRediff;
	static int countYahoo;
	
	public static void main(String[]args) {
		String[] str= {"abc@gmail.com","xyz@rediff.com", "yyy@yahoo.com","ddd@gmail.com","rr@rediff.com","vv@yahoo.com"};
		for(int i=0; i<str.length; i++) {
			int index= str[i].lastIndexOf('@');
			char ch=str[i].charAt(index+1);
			if(ch=='g')
			{
				countGmail++;
			}
			else if(ch=='y'){
				countYahoo++;
				
			}
			else if(ch=='r') {
				countRediff++;
			}
			else {
				System.out.println("Incorrect email");
			}
		}
		System.out.println("Gmail Accounts:"+countGmail+"\n Yahoo Accounts:"+countYahoo+"\n Rediff Accounts:"+countRediff);
				
		
		
		
	}

}
