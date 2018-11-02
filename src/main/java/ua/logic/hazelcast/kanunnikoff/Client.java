package ua.logic.hazelcast.kanunnikoff;

import com.hazelcast.client.*;
import com.hazelcast.core.*;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        Map<String, Integer> map = client.getMap("map");
        if (map.isEmpty()) {
            for (int k = 0; k < 42; k++)
                map.put("" + k, 1);
        }
        System.out.println(map.size());
        client.shutdown();
    }
}
