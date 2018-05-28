package com.selvakumar.graph.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph<T> {

	private final HashMap<T, Set<T>> adjacencyList;

	public Graph() {
		this.adjacencyList = new HashMap<>();
	}

	public void addVertex(T vertex) {
		if (this.adjacencyList.containsKey(vertex)) {
			System.err.println("vertex already exists");
		} else {
			this.adjacencyList.put(vertex, new HashSet<T>());
		}
	}

	public void removeVertex(T vertex) {
		if (!this.adjacencyList.containsKey(vertex)) {
			System.err.println("vertex doesn't exists");
		} else {
			this.adjacencyList.remove(vertex);
		}
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

	public HashMap<T, Set<T>> getAdjacencyList() {
		return adjacencyList;
	}
}
