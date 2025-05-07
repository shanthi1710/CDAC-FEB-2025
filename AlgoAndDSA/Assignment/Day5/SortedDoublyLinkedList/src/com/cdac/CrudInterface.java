package com.cdac;

public interface CrudInterface {
	boolean isEmpty();
	void insert(int element);
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	void print();
}
