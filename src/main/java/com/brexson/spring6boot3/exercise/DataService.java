package com.brexson.spring6boot3.exercise;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
