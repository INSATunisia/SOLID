package com.directi.training.srp.solution;

import java.util.List;

public class ListComparer {
    
    public static <T extends Comparable<T>> T getBest(List<T> list)
    {
        T best = null;
        for (T el : list) {
            if (best == null || el.compareTo(best) > 0) {
                best = el;
            }
        }
        return best;
    }
}
