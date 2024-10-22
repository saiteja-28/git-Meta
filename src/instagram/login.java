package instagram;

public class login {
String un;
String email;
long pass;
int age;
char gender;
public login(String un, String email, long pass) {
	super();
	this.un = un;
	this.email = email;
	this.pass = pass;
}
public login(String un, String email, long pass, char gender) {
	this(un,email,pass);
	this.gender = gender;
}
public login(String un, String email, long pass, int age) {
	this(un,email,pass);
	this.age = age;
}
public login(String un, String email, long pass, int age, char gender) {
	this(un,email,pass);
	this.age = age;
	this.gender = gender;
}
public void details(String un,String email,long pass,int age,char gender)
{
	System.out.println(un);
	System.out.println(pass);
	System.out.println(email);
	System.out.println(age);
	System.out.println(gender);
}
public void details(String un,String email,long pass)
{
	System.out.println(un);
	System.out.println(pass);
	System.out.println(email);
}
}