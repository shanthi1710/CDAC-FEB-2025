package com.acts.utils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.acts.Printer;

public interface BinIOUtils {
	
	public static void saveData(Map<Integer, Printer>data, String fileName) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(fileName))){
			Set<Integer> key = new HashSet<>();
			key = data.keySet();
			for(Integer k: key) {
				oos.writeObject(k);
				oos.writeObject(data.get(k));
			}
		}
		}
	
	public static Map<Integer, Printer> readData(String fileName) throws IOException, ClassNotFoundException{
		Map<Integer, Printer> fileData = new HashMap<>();
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(fileName))){
			Printer data;
			Integer key;
			for(;;) {
				key = (Integer) ois.readObject();
				data = (Printer) ois.readObject();
				fileData.put(key, data);
			}
		}catch (EOFException eof) {
				System.out.println("Stop Reading");
		}
		return fileData;
	}
	} 
	
