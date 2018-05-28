package com.selvakumar.test;

import com.selvakumar.graph.impl.Graph;
import com.selvakumar.pojo.Person;

public class GraphTest {


	private static void printGraph(Graph graph) {

		for (Object val : graph.getAllVertices()) {
			System.out.println(val + " -> " + graph.getAdjacencyList().get(val));
		}
		System.out.println("\n");

	}

	private static int ageGrouper(int age) {
		int[] groupMin = new int[] { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] groupMax = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 9999 };

		for (int i = 0; i < groupMin.length; i++) {
			if (age >= groupMin[i] && age < groupMax[i]) {
				return i ;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Graph graph = new Graph();

		/**
		 * adding person , age and country vertices
		 */
		for (int i = 1; i < 5; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("person" + i);
			person.setCountry("india");
			person.setPhone("9876543210");
			person.setAge(i*10);
			graph.addVertex(person);
			graph.addVertex(ageGrouper(person.getAge()));
			graph.addVertex(person.getCountry());
			graph.addEdge(person,ageGrouper(person.getAge()));
			graph.addEdge(person,person.getCountry());
		}
		printGraph(graph);

	}

}
