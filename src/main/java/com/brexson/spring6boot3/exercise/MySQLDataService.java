package com.brexson.spring6boot3.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataService  implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2, 3, 4, 5};
    }
}
