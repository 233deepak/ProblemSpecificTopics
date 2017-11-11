package com.deepak.test.heap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.heaps.DFS;
import com.deepak.algo.heaps.Edge;
import com.deepak.algo.heaps.Vertex;

public class TestDFS {

	@Test
	public void testCreateGraph() {

		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");

		List<Vertex> vertexs = new ArrayList<Vertex>();
		vertexs.add(vertexA);
		vertexs.add(vertexB);
		vertexs.add(vertexC);
		vertexs.add(vertexD);
		vertexs.add(vertexE);
		vertexs.add(vertexF);

		Edge edgeAB = new Edge(vertexA, vertexB);
		Edge edgeBE = new Edge(vertexB, vertexE);
		Edge edgeAD = new Edge(vertexA, vertexD);
		Edge edgeDB = new Edge(vertexD, vertexB);
		Edge edgeED = new Edge(vertexE, vertexD);
		Edge edgeCE = new Edge(vertexC, vertexE);
		Edge edgeFC = new Edge(vertexF, vertexC);

		Edge[] edges = { edgeAB, edgeAD, edgeBE, edgeCE, edgeDB, edgeED, edgeFC };

		DFS dfs = new DFS(vertexs, edges);
		System.out.println(dfs.getGraph());
	}

	@Test
	public void testDFS() {
		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");

		List<Vertex> vertexs = new ArrayList<Vertex>();
		vertexs.add(vertexA);
		vertexs.add(vertexB);
		vertexs.add(vertexC);
		vertexs.add(vertexD);
		vertexs.add(vertexE);
		vertexs.add(vertexF);

		Edge edgeAB = new Edge(vertexA, vertexB);
		Edge edgeBE = new Edge(vertexB, vertexE);
		Edge edgeAD = new Edge(vertexA, vertexD);
		Edge edgeDB = new Edge(vertexD, vertexB);
		Edge edgeED = new Edge(vertexE, vertexD);
		Edge edgeCE = new Edge(vertexC, vertexE);
		Edge edgeCF = new Edge(vertexC, vertexF);
		Edge edgeFF = new Edge(vertexF, vertexF);
		
		Edge[] edges = { edgeAB, edgeAD, edgeBE, edgeCE, edgeDB, edgeED, edgeFF ,edgeCF };

		DFS dfs = new DFS(vertexs, edges);
		dfs.dfs();
		dfs.printDisjointVisits();
	}

}
