package com.selvakumar.graph;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {

	private final LinkedHashMap<T, List<T>> adjacencyList;

	public Graph() {
		this.adjacencyList = new LinkedHashMap<T, List<T>>();
	}

	public void addVertex(T vertex) {
		if (this.adjacencyList.containsKey(vertex)) {
			System.err.println("vertex already exists");
		} else {
			this.adjacencyList.put(vertex, new LinkedList<T>());
		}
	}

	public void removeVertex(T vertex) {
		this.adjacencyList.remove(vertex);
	}

	public void addEdge(T startVertex, T endVertex) {
		if (!this.adjacencyList.containsKey(startVertex) || !this.adjacencyList.containsKey(endVertex)) {
			System.err.println("vertex doesn't exists");
		} else {
			this.adjacencyList.get(startVertex).add(endVertex);
			this.adjacencyList.get(endVertex).add(startVertex);
		}
	}

	public void removeEdge(T startVertex, T endVertex) {
		if (!this.adjacencyList.containsKey(startVertex) || !this.adjacencyList.containsKey(endVertex)) {
			System.err.println("vertex doesn't exists");
		} else {
			this.adjacencyList.get(startVertex).remove(endVertex);
			this.adjacencyList.get(endVertex).remove(startVertex);
		}
	}

	public Iterable<T> getAllVertices() {
		return this.adjacencyList.keySet();
	}

	public LinkedHashMap<T, List<T>> getAdjacencyList() {
		return adjacencyList;
	}
	
	
	
	
}
