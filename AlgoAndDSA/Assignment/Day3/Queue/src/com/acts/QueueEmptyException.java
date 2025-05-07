package com.acts;

public class QueueEmptyException extends RuntimeException {
	public QueueEmptyException(String str) {
		super(str);
	}
}