package com.ghy.demo3.branchwarehouse;

import java.text.SimpleDateFormat;

public class DataSourceProxy implements DatumService{

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private DatumService datumService;

    public DataSourceProxy(DatumService datumService){
        this.datumService = datumService;
    }
    @Override
    public int insert(Datum datum) {
        before();
        String name = datum.getName();
        System.out.println( "静态代理处理流程");
        DataSource.set(name);
        datumService.insert(datum);
        after();
        return 0;
    }

    private void before(){ System.out.println("加的第一层代码"); }
    private void after(){ System.out.println("加的第二层代码"); }
}
