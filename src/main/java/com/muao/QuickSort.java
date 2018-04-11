package com.muao;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {    

        public static List doQuick(List<Integer> list) {

            if (list.size() <= 1) {
                return list;
            }

            ArrayList lesser = new ArrayList<>();
            ArrayList greater = new ArrayList<>();
            int lastElementPos = list.size() - 1;
            int pivot = list.get(lastElementPos);

            for (int i = 0; i < lastElementPos; i++) {
                if (list.get(i) < (pivot)) {
                    lesser.add(list.get(i));
                } else {
                    greater.add(list.get(i));
                }
            }

            lesser = (ArrayList) doQuick(lesser);
            greater = (ArrayList) doQuick(greater);

            lesser.add(pivot);
            lesser.addAll(greater);

            return lesser;
        }
    }

