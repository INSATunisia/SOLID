package com.directi.training.srp.solution;

import java.util.List;

public class ListFormatter {
    public static <T> String formatList(List<T> list){

        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(obj.toString());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
