package com.deepak.algo.independentset;

import java.util.List;

public interface Graph<V> {

    List<V> getNeighbours(V v);
    
    int getSize();
    
    int[][] getAdjacencyMatrix();
    
    
    List<V> getVertices();
    
    public List<List<Integer>> getAdjancencyList();
    
    
    
}
