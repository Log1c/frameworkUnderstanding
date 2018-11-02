package ua.logic.hazelcast.gamov;

import com.hazelcast.core.*;

import java.util.*;
import java.util.concurrent.*;

public class MasterMember {
    public static void main(String[] args) throws Exception {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, Integer> map = hz.getMap("map");
        if (map.isEmpty()) {
            for (int k = 0; k < 42; k++)
                map.put("" + k, 1);
        }

        IExecutorService executor = hz.getExecutorService("executor");
        Map<Member, Future<Integer>> result = executor.submitToAllMembers(new SumTask());

        int sum = 0;
        for (Future<Integer> future : result.values())
            sum += future.get();

        System.out.println("Result: " + sum);
    }
}
