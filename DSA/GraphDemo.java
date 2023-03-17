import java.util.*;
class GraphDemo{
	ArrayList<ArrayList<Integer>> graph;
	int v;
	GraphDemo(int nodes){
		v= nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<v;i++)
			graph.add(new ArrayList<Integer>());
		
	}
	void addEdge(int v , int u){
		graph.get(v).add(u);
		
	}
	void display(){
		for(int i = 1; i<v;i++){
			System.out.println("Node "+i);
			for(int x: graph.get(i))
				System.out.println("-->"+x);
		}
	}
	public static void main(String [] args){
		GraphDemo g = new GraphDemo(6);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,5);
		g.addEdge(3,4);
		g.addEdge(4,5);
		g.display();
		
	}
}