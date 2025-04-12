package com.cdac.acts.list.impl;

import com.cdac.acts.list.MyList;

public class GrowableList implements MyList {

	private int arr[];
	private int currIndex;
	private int size;
	
	public GrowableList() {
		super();
		size = 5;
		currIndex = 0;
		arr = new int [size];
	}

	@Override
	public void insert(int ele) {
		if(currIndex == size) {
			//list is full
			//Grow and copy
			//Create new array with double size
			size = size *2 ;
			int tempArr[] = new int[size];
			//Copy from old array to new array
			for( int i =0; i < currIndex; i++) {
				tempArr[i] = arr[i];
			}
			//Mark temp as main arr
			arr = tempArr;
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
