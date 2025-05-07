package com.acts;

public class QueueFullException extends RuntimeException {
	public QueueFullException(String str) {
		super(str);
	}
}
