package com.tnsif.lambdaexpdemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingFunctionInterfaces {
	
	class Display
	{
		static void show(String s)
		{
			System.out.println("********"+s+"***********");
		}
		
		static String print()
		{
			return "I am a Supplier";
		}
	}

	public static void main(String[] args) {
		//Consumer
		
				
		Consumer<String> consumer=(name)->System.out.println("Welcome "+name);
		consumer.accept("Sachita");
		
		
		consumer=Display::show; //method reference of static method
		consumer.accept("Gowtham");
		
		consumer=System.out::println; //method reference of non-static method
		consumer.accept("Hello All");
		
		
		System.out.println("___________________________");
		
		
		//supplier functional interface
		Supplier<String> supplier=()->"Hello from Supplier ";
		System.out.println(supplier.get());
		
		supplier=Display::print;
		System.out.println(supplier.get());
		
		//Predicate Functional Interface
		//positive number test
		Predicate<Integer> predicate=num->num>0;
		System.out.println(predicate.test(34));
		System.out.println(predicate.test(-67));
		
		
		//Even
		Predicate<Integer> p=num->num%2==0;
		System.out.println(p.test(34));
		System.out.println(p.test(67));
		
		//Function Functional Interface
		
		//max test
		BiFunction<Integer,Integer,Integer> maxFunction=(x,y)->x>y ?x:y;
		System.out.println(maxFunction.apply(23, 78));
		
		BiFunction<String,Integer,String> printFunction=(name,num)->name+num;
		System.out.println(printFunction.apply("Welcome Students of B", 69));
		
		Function<Integer,Integer> mul=(x)->x*x;
		System.out.println(mul.apply(23));
	}

}
