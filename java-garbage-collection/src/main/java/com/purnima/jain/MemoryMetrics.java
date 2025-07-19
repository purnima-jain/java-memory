package com.purnima.jain;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMetrics {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize a HashMap
		Map<String, String> map = new HashMap<>();

		Runtime runtime = Runtime.getRuntime();

		// Initial State
		long availableBytes = convertToMb(runtime.freeMemory());
		long currentHeapOccupancy = convertToMb(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed());
		System.out.println("At Start: Free Memory :: " + availableBytes + "m" + " Allocated Memory :: " + currentHeapOccupancy + "m");

		// Create lots of objects....
		for (int count = 0; count < 100; count++) {
			for (int i = 0; i < 1000000; i++) {
				map.put(new String("key-" + count), new String("value-" + count));
			}
		}
		
		availableBytes = convertToMb(runtime.freeMemory());
		currentHeapOccupancy = convertToMb(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed());
		System.out.println("After entries are added to HashMap: Free Memory :: " + availableBytes + "m" + " Allocated Memory :: " + currentHeapOccupancy + "m");
		
		// Clear the map
		map.clear();
		
		availableBytes = convertToMb(runtime.freeMemory());
		currentHeapOccupancy = convertToMb(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed());
		System.out.println("After entries are removed from HashMap: Free Memory :: " + availableBytes + "m" + " Allocated Memory :: " + currentHeapOccupancy + "m");
		
		// Wait for a second
		Thread.sleep(1000);
		
		availableBytes = convertToMb(runtime.freeMemory());
		currentHeapOccupancy = convertToMb(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed());
		System.out.println("1 Second later: Free Memory :: " + availableBytes + "m" + " Allocated Memory :: " + currentHeapOccupancy + "m");
		
		// Call Garbage Collection (only a hint)
		System.gc();
		
		availableBytes = convertToMb(runtime.freeMemory());
		currentHeapOccupancy = convertToMb(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed());
		System.out.println("After Garbage Collection: Free Memory :: " + availableBytes + "m" + " Allocated Memory :: " + currentHeapOccupancy + "m");
	}

	private static long convertToMb(long bytes) {
		return bytes / 1024 / 1024;
	}

}
