package com.deepak.algo.nphard;


public class HamiltonionPath {

	public <v> boolean  hamiltonionPath(boolean[] visited, int nextNode ,Graph<v> graph) {
		if (allNodeVisited(visited)) {
			return true;
		} else {
             for(Integer neighbour : graph.neighbours.get(nextNode-1)) {
            	 visited[neighbour-1] =true;
            	 if(hamiltonionPath(visited, neighbour, graph))
            		 return true;
            	 visited[neighbour-1] =false;
             }
             return false;
		}

	}

	private boolean allNodeVisited(boolean[] visits) {
		for (boolean visit : visits) {
			if (!visit)
				return false;
		}

		return true;
	}

}
