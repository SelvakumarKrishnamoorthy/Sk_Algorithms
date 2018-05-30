package com.selvakumar.graph.utils;

import com.selvakumar.graph.Graph;

public class GraphUtil {
	
	
	public static int ageGrouper(int age) {
		int[] groupMin = new int[] { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] groupMax = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 9999 };

		for (int i = 0; i < groupMin.length; i++) {
			if (age >= groupMin[i] && age < groupMax[i]) {
				return i ;
			}
		}
		return -1;
	}
	
	public static void printGraph(Graph graph) {
		for (Object val : graph.getAllVertices()) {
			System.out.println(val + " -> " + graph.getAdjacencyList().get(val));
		}
		System.out.println("\n");

	}

}
