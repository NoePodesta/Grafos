package Model;

import java.util.List;

/**
 * User: NoePodesta
 * Date: 26/01/13
 * Time: 17:10
 */
public interface Graph {

    public void addVertex(Object x);
    public void addEdge(int v, int w, double weight);
    public void removeEdge(int v, int w);
    public void removeVertex(int v);

    public double getWeight(int v, int w);
    public int getOrder();
    public int getEdgeSize();
    public Object getVertex(int v);
    public List<Integer> getAdjacentList(int v);
    public boolean existEdge(int v1, int v2);
    public int existVertex(Object o);





}
