package ua.logic.hazelcast.officialDocs;

import com.hazelcast.client.*;
import com.hazelcast.core.*;
import com.hazelcast.query.*;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        IMap<Integer, Student> map = client.getMap("students");
        if (map.isEmpty()) {
            for (int k = 0; k < 42; k++)
                map.put(k, new Student("" + k, k + 20));
        }
        map.values().forEach(System.out::println);
        System.out.println("-----");

        Predicate greaterEqual = Predicates.greaterEqual("age", 30);
        PagingPredicate pagingPredicate = new PagingPredicate(greaterEqual, 5);

        Collection<Student> values = map.values(pagingPredicate);

//        System.out.println(map.size());
        values.forEach(System.out::println);
        client.shutdown();
    }
}
