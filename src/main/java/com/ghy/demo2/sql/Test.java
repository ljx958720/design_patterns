package com.ghy.demo2.sql;

import javax.management.Query;
import java.util.Arrays;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        QueryRule queryRule = QueryRule.getInstance();
        queryRule.addAscOrder("name");
        queryRule.andEqual("addr","abc");
        queryRule.andLike("name","ljx");
        QueryRuleSqlBuilder builder = new QueryRuleSqlBuilder(queryRule);

        System.out.println(builder.builder("aut_member"));

        System.out.println("Params: " + Arrays.toString(builder.getValues()));


    }
}
