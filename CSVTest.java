package com.juke123.jsondata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * CSV操作(导出和导入)
 * 
 */
public class CSVTest {

    /**
     * CSV导出
     * 
     * @throws Exception
     */
    @Test
    public void exportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,王五,女");
        CSVUtils csv = new CSVUtils();
        boolean isSuccess=csv.exportCsv(new File("D:/test.csv"), dataList);
        System.out.println(isSuccess);
    }
    
    /**
     * CSV导出
     * 
     * @throws Exception
     */
    @Test
    public void importCsv()  {
        List<String> dataList=CSVUtils.importCsv(new File("D:/test.csv"));
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }
    
    
}