/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normal.search;

/**
 *
 * @author ITCLANBD
 */
public class NORMALSEARCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] a = {"A", "B", "C", "D", "E"};
        int[] a1 = {7, 13, 19, 5, 8};
        Object[]sorted={5,7,12,14,20};
        Node n1 = new Node(7, null);
        Node n2 = new Node(13, null);
        Node n3 = new Node(19, null);
        Node n4 = new Node(5, null);
        Node n5 = new Node(8, null);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node Head = n1;
        System.out.println("========== Sequential search in a sequence ================");
        SEQUENTIAL_SEARCH sequencial_search = new SEQUENTIAL_SEARCH();
        System.out.println(sequencial_search.searchLinkedList(Head, 19));
        System.out.println(sequencial_search.searchArray(a, 0, "D"));
        
        System.out.println("========== Binary search in a sorted array ================");
        BINARY_SEARCH_SORTED binary_search_sorted = new BINARY_SEARCH_SORTED();
        System.out.println(binary_search_sorted.BinaryArray(a, 0, 4, "D"));
        
        System.out.println("========== Finding the maximum in a sequence (linear version) ================");
        MAXIMUM_LINEAR maximum_linear = new MAXIMUM_LINEAR();
        System.out.println(maximum_linear.MaximumArray(a1, 0, 4));

        System.out.println("========== Finding the maximum in an array (binary version) ================");
        MAXIMUM_BINARY maximum_binary = new MAXIMUM_BINARY();
        System.out.println(maximum_binary.BinaryMax(a1, 0, 4));
        System.out.println("========== Binary search in a sorted array 2 ================");
        BINARY_SEARCH binary_search=new BINARY_SEARCH();
        System.out.println(binary_search.BinarySearch(sorted,5,12));
    }

}
