package com.purnima.jain;

import java.util.HashMap;
import java.util.Map;

public class NoOOMCrash {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application started.......");

		// Pause the main thread for 2 seconds (2000 milliseconds)
		// Thread.sleep(20000); // 20 seconds

		Map<String, String> map = new HashMap<>();

		long counter = 0;
		while (true) {

			counter++;
			map.put("key-" + counter, "value-" + counter); // Keep adding entries to the map

			if (counter % 10000 == 0) {
				System.out.println("Added " + counter + " elements");
				System.out.println("Removing " + counter + " elements");
				map = new HashMap<>(); // Allocate new Map instance
				Thread.sleep(2000);
			}
		}

	}

}
