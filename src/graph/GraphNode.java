/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohammed El-Agha
 */
public class GraphNode<E> {
    List<GraphNode<E>> supers;
    List<GraphNode<E>> subs;
    E data;

    public GraphNode(E data) {
        supers = new ArrayList();
        subs = new ArrayList();
        this.data = data;
    }
    
    public List<GraphNode<E>> getSupers() {
        return supers;
    }
    
    public void setSuper(GraphNode<E> node) {
        this.supers.add(node);
    }
    
    public List<GraphNode<E>> getSubs() {
        return subs;
    }
    
    public void setSub(GraphNode<E> node) {
        this.subs.add(node);
    }
}
