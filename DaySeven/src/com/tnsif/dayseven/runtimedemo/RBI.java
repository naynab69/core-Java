package com.tnsif.dayseven.runtimedemo;

//parent
public class RBI {
	public float getRateofInterest()
	{
		return 7.0f;
	}

}
//child1
class Axis extends RBI
{
	public float getRateofInterest()
	{
		return 6f;
	}
}

//child2
class ICICI extends RBI
{
	public float getRateofInterest()
	{
		return 7.9f;
	}
}

//child3
class HDFC extends RBI
{
	public float getRateofInterest()
	{
		return 5.6f;
	}
}