import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//pass first element and visited array as parameter
//make visited = true for element
//iterator over it's adjacent and do recursion while passing adjacent and visited array.
public class DFS {
	int v;
	List<LinkedList<Integer>> listOfNode = new ArrayList<LinkedList<Integer>>();
	DFS(int v){
		this.v = v;
		for(int i=0;i<v;i++) {
			listOfNode.add(new LinkedList<Integer>());
		}
	}
	void addEdge(int v, int w) {
		listOfNode.get(v).add(w);
	}
	void DFS(int s) {
		boolean[] visited = new boolean[v];
		
		DFSUtil(s,visited);
	}
	void DFSUtil(int s, boolean[] visited) {
		visited[s] = true;
		System.out.println(s);
		Iterator<Integer> i = listOfNode.get(s).iterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	public static void main(String[] args) {
		DFS d = new DFS(4);
		d.addEdge(0, 1);
		d.addEdge(0, 2);
		d.addEdge(1, 2);
		d.addEdge(2, 0);
		d.addEdge(2, 3);
		d.addEdge(3, 3);
		d.DFS(2);
	}
}
