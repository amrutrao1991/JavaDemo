package com.main;

public interface List<T> 
{
	public T get();
	public void add(T t);
	public T poll();
	public T peek();
}
