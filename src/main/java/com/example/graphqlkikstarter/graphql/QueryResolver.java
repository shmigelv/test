package com.example.graphqlkikstarter.graphql;

import com.example.graphqlkikstarter.dto.Input1;
import com.example.graphqlkikstarter.v2.Input;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

//    public String getTest(Input1 val) {
//        return "test";
//    }

    public String test(Input input) {
        return "Ok";
    }

}
