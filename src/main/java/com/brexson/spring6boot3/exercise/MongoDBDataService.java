package com.brexson.spring6boot3.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
   @Override
    public int[] retrieveData() {
        return new int[] {11,22, 33, 44, 55};
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
