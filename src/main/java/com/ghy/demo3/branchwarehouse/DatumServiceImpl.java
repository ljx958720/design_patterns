package com.ghy.demo3.branchwarehouse;

public class DatumServiceImpl implements DatumService{

    private  DatumDao datumDao;

    public  DatumServiceImpl(){
        datumDao=new DatumDao();
    }
    @Override
    public int insert(Datum datum) {
        System.out.println("逻辑代码");
        return datumDao.insert(datum);
    }
}
