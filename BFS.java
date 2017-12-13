import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//add first start node in queue, remove it, print it
//iterate over the adjacent node of that node,add them, make visited flag true
public class BFS {
	int v;
	List<LinkedList<Integer>> listOfNode = new ArrayList<LinkedList<Integer>>();
	BFS(int v){
		this.v = v;
		
		for(int i=0;i<v;i++) {
			listOfNode.add(new LinkedList<Integer>());
		}
	}
	void addEdge(int v, int w) {
		listOfNode.get(v).add(w);
	}
	void bfs(int s) {
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while(queue.size()!=0) {
			s= queue.poll();
			System.out.println("s"+s);
			Iterator<Integer> i = listOfNode.get(s).iterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS b = new BFS(4);
		b.addEdge(0, 1);
		b.addEdge(0, 2);
		b.addEdge(1, 2);
		b.addEdge(2, 0);
		b.addEdge(2, 3);
		b.addEdge(3, 3);
		b.bfs(2);
		
	}
}
