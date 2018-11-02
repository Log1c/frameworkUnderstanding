package ua.logic.hazelcast.gamov;

import com.hazelcast.core.*;

import java.io.*;
import java.util.concurrent.*;

public class SumTask implements
        Callable<Integer>, Serializable, HazelcastInstanceAware {
    private transient HazelcastInstance hz;

    public void setHazelcastInstance(HazelcastInstance hz) {
        this.hz = hz;
    }

    public Integer call() {
        IMap<String, Integer> map = hz.getMap("map");
        int result = 0;
        for (String key : map.localKeySet()) {
            System.out.println("Calculating for key: " + key);
            result += map.get(key);
        }
        System.out.println("Local Result: " + result);
        return result;
    }
}
