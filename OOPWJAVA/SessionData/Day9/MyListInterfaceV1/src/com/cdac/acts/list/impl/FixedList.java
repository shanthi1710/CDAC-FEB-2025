package com.cdac.acts.list.impl;

import com.cdac.acts.list.MyList;

public class FixedList implements MyList {
	
	private int arr[];
	private int currIndex;
	private final int size;
	
	public FixedList() {
		super();
		this.size = 5;
		this.currIndex = 0;
		this.arr = new int [size];
	}

	@Override
	public void insert(int ele) {
		if(currIndex == size) {
			System.out.println("List is full. Element is not added");
			return;
		}
		arr[currIndex++] = ele;

	}

	@Override
	public int retrieve(int index) {
		if(index < 0 && index > size-1) {
			System.out.println("Invalid index. Element can not be retrieved");
			return 0;
		}
		return arr[index];
	}

}
