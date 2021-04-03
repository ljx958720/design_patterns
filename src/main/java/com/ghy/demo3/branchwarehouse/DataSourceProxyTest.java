package com.ghy.demo3.branchwarehouse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSourceProxyTest {
    public static void main(String[] args) {
        Datum datum = new Datum();
        datum.setName("张三");
        DatumService datumService = new DataSourceProxy(new DatumServiceImpl());
        datumService.insert(datum);
    }
}
