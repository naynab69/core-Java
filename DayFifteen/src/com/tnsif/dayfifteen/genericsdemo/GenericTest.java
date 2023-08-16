package com.tnsif.dayfifteen.genericsdemo;

public class GenericTest<T> {
	
	T obj;
	
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}

	public static void main(String[] args) {
		
		GenericTest<String> obj=new GenericTest<String>();
		obj.add("Nayna");
		System.out.println(obj.get());
		
		GenericTest<Integer> obj1=new GenericTest<>();
		obj1.add(10);
		System.out.println(obj.get());
		
		GenericTest<Float> obj2=new GenericTest<>();
		obj2.add(10.6f);
		System.out.println(obj.get());
		

	}

}
