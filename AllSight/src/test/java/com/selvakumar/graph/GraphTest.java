package com.selvakumar.graph;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.selvakumar.graph.utils.GraphUtil;
import com.selvakumar.pojo.Person;

public class GraphTest {

	Graph graph;

	@Before
	public void executeFirst() {
		graph = new Graph();
		for (int i = 1000; i < 1005; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("person" + i);
			person.setCountry("india");
			person.setPhone("9876543210");
			person.setAge(i - 990);
			graph.addVertex(person);
			graph.addVertex(GraphUtil.ageGrouper(person.getAge()));
			graph.addVertex(person.getCountry());
			graph.addEdge(person, GraphUtil.ageGrouper(person.getAge()));
			graph.addEdge(person, person.getCountry());
		}

		for (int i = 1005; i < 1010; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("person" + i);
			person.setCountry("USA");
			person.setPhone("9876543210");
			person.setAge(i - 990);
			graph.addVertex(person);
			graph.addVertex(GraphUtil.ageGrouper(person.getAge()));
			graph.addVertex(person.getCountry());
			graph.addEdge(person, GraphUtil.ageGrouper(person.getAge()));
			graph.addEdge(person, person.getCountry());
		}

		for (int i = 1010; i < 1015; i++) {
			Person person = new Person();
			person.setId(i);
			person.setName("person" + i);
			person.setCountry("Russia");
			person.setPhone("9876543210");
			person.setAge(i - 990);
			graph.addVertex(person);
			graph.addVertex(GraphUtil.ageGrouper(person.getAge()));
			graph.addVertex(person.getCountry());
			graph.addEdge(person, GraphUtil.ageGrouper(person.getAge()));
			graph.addEdge(person, person.getCountry());
		}
		
		// prints the Graph Adjacency List with Vertex -> edges group
		GraphUtil.printGraph(graph);
	}

	@Test
	public <T> void testCountryAndAgeFilter() {
		String primaryCountryFilter = "india";	
		int secondaryAgeGroupFilter = 1;
		LinkedList<T> list = (LinkedList<T>) graph.getAdjacencyList().get(primaryCountryFilter);
		LinkedList<T> list2 = (LinkedList<T>) graph.getAdjacencyList().get(secondaryAgeGroupFilter);
		list.retainAll(list2);
		System.out.println("user under Country India and AgeGroup between 10-20"+ list);
	}
}
