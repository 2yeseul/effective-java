package com.example.effectivejava.ch06;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AdapterTest {

    @Test
    void mapTest() {
        Map<String, String> map = new HashMap<>();

        String key = "Effective";
        String value ="Java";

        map.put(key, value);

        Set<String> keySet1 = map.keySet();
        Set<String> keySet2 = map.keySet();

        assertThat(keySet1).isEqualTo(keySet2);

        map.remove(key);

        assertThat(keySet1).isEqualTo(keySet2);
    }
}
