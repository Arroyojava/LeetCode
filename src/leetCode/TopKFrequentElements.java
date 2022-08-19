/*
    Given an integer array nums and an integer k, return the k most frequent elements.
    You may return the answer in any order.
 */

package leetCode;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(numbers, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}
