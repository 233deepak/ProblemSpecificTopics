package com.deepak.test.heap;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.heaps.DAG;
import com.deepak.algo.heaps.Edge;
import com.deepak.algo.heaps.Vertex;

public class TestDAG {

	@Test
	public void testTopologicalDAG() {
		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");
		Vertex vertexS = new Vertex("s");

		List<Vertex> vertexs = new ArrayList<Vertex>();
		vertexs.add(vertexA);
		vertexs.add(vertexB);
		vertexs.add(vertexC);
		vertexs.add(vertexD);
		vertexs.add(vertexE);
		vertexs.add(vertexF);
		vertexs.add(vertexS);

		Edge edgeSA = new Edge(vertexS, vertexA, 1);
		Edge edgeSB = new Edge(vertexS, vertexB, 2);

		Edge edgeAB = new Edge(vertexA, vertexB, 3);
		Edge edgeAE = new Edge(vertexA, vertexE, 2);
		Edge edgeAC = new Edge(vertexA, vertexC, 5);

		Edge edgeBD = new Edge(vertexB, vertexD, 1);
		// Edge edgeBA = new Edge(vertexB, vertexA, 1);

		Edge edgeCE = new Edge(vertexC, vertexE, 3);

		Edge edgeDC = new Edge(vertexD, vertexC, 2);
		Edge edgeDF = new Edge(vertexD, vertexF, 1);

		Edge edgeEF = new Edge(vertexE, vertexF, 4);
		// Edge edgeED = new Edge(vertexE, vertexD, 1);

		Edge[] edges = { edgeAB, edgeAE, edgeAC, edgeBD, edgeDC, edgeDF,
				edgeEF, edgeCE, edgeSA, edgeSB };
		DAG dag = new DAG(vertexs, edges);
		System.out.println(dag.getGraph());
		dag.doTopologicalSort();

	}

	@Test
	public void relaxAllEdgesDAG() {
		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");
		Vertex vertexS = new Vertex("s");

		List<Vertex> vertexs = new ArrayList<Vertex>();
		vertexs.add(vertexA);
		vertexs.add(vertexB);
		vertexs.add(vertexC);
		vertexs.add(vertexD);
		vertexs.add(vertexE);
		vertexs.add(vertexF);
		vertexs.add(vertexS);

		Edge edgeSA = new Edge(vertexS, vertexA, 1);
		Edge edgeSB = new Edge(vertexS, vertexB, 2);

		Edge edgeAB = new Edge(vertexA, vertexB, 3);
		Edge edgeAE = new Edge(vertexA, vertexE, 2);
		Edge edgeAC = new Edge(vertexA, vertexC, 5);

		Edge edgeBD = new Edge(vertexB, vertexD, 1);
		// Edge edgeBA = new Edge(vertexB, vertexA, 1);

		Edge edgeCE = new Edge(vertexC, vertexE, 3);

		Edge edgeDC = new Edge(vertexD, vertexC, 2);
		Edge edgeDF = new Edge(vertexD, vertexF, 1);

		Edge edgeEF = new Edge(vertexE, vertexF, 4);
		// Edge edgeED = new Edge(vertexE, vertexD, 1);

		Edge[] edges = { edgeAB, edgeAE, edgeAC, edgeBD, edgeDC, edgeDF,
				edgeEF, edgeCE, edgeSA, edgeSB };
		DAG dag = new DAG(vertexs, edges);
		System.out.println(dag.getGraph());
		dag.doTopologicalSort();
        dag.findSohrtestpath(vertexA);
	}
	
	@Test
	public void testShortesPath(){
		Vertex vertexA = new Vertex("a");
		Vertex vertexB = new Vertex("b");
		Vertex vertexC = new Vertex("c");
		Vertex vertexD = new Vertex("d");
		Vertex vertexE = new Vertex("e");
		Vertex vertexF = new Vertex("f");
		Vertex vertexS = new Vertex("s");

		List<Vertex> vertexs = new ArrayList<Vertex>();
		vertexs.add(vertexA);
		vertexs.add(vertexB);
		vertexs.add(vertexC);
		vertexs.add(vertexD);
		vertexs.add(vertexE);
		vertexs.add(vertexF);
		vertexs.add(vertexS);

		Edge edgeSA = new Edge(vertexS, vertexA, 1);
		Edge edgeSB = new Edge(vertexS, vertexB, 2);

		Edge edgeAB = new Edge(vertexA, vertexB, 3);
		Edge edgeAE = new Edge(vertexA, vertexE, 2);
		Edge edgeAC = new Edge(vertexA, vertexC, 5);

		Edge edgeBD = new Edge(vertexB, vertexD, 1);
		// Edge edgeBA = new Edge(vertexB, vertexA, 1);

		Edge edgeCE = new Edge(vertexC, vertexE, 3);

		Edge edgeDC = new Edge(vertexD, vertexC, 2);
		Edge edgeDF = new Edge(vertexD, vertexF, 1);

		Edge edgeEF = new Edge(vertexE, vertexF, 4);
		// Edge edgeED = new Edge(vertexE, vertexD, 1);

		Edge[] edges = { edgeAB, edgeAE, edgeAC, edgeBD, edgeDC, edgeDF,
				edgeEF, edgeCE, edgeSA, edgeSB };
		DAG dag = new DAG(vertexs, edges);
		System.out.println(dag.getGraph());
		dag.doTopologicalSort();
        dag.findSohrtestpath(vertexA);
        dag.printShortestPath(vertexA, vertexF);
	}

}
