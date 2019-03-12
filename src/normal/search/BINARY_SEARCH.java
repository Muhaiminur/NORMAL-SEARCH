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
public class BINARY_SEARCH {

    public int BinarySearch(Object[] a, int size, Object key) {
        //it works if sequence is already sorted
        //use  random access
        //binary search is need log2(n)time
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int mid = (start + size) / 2;
            if (key.equals(a[mid])) {
                return mid;
            } else if (((Comparable) key).compareTo(a[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
