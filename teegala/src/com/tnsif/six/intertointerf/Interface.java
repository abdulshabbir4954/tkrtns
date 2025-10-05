package com.tnsif.six.intertointerf;

public interface Interface {
	void eat();
	void sleep();

}
interface InterfacExt1 extends Interface{
	void shout();
	
}
class Cat implements InterfacExt1{
	public void eat(){
		System.out.println("Cat is driking");
	}
	public void sleep(){
		System.out.println("Cat is sleeping");
	}
	public void shout(){
		System.out.println("Cat is playing");
	}
}
