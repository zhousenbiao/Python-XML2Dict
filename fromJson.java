package com.juke123.jsondata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;



public class fromJson{  
	
	
	public static void main(String[] args) {
//		List<SurveyVO> categorys = fromJson.getdata() ;
//
//		Iterator<SurveyVO> it = categorys.iterator();
//		SurveyVO category = (SurveyVO) it.next();
//		System.out.println(category.getSurveyId());
//		System.out.println(category.getSurveyName());
	}
	
	public static String readTxtFile(String filePath){
		String jdata=null;
        try {
        	
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){
                        System.out.println("读取到了"+lineTxt);
                       jdata=lineTxt;
                    }
                    read.close();
                    
                    
//                    System.out.println("以行为单位读取文件内容，一次读一整行：");
//                    reader = new BufferedReader(new FileReader(file));
//                    while ((tempString = reader.readLine()) != null) {
//                        System.out.println("Line"+ line + ":" +tempString);
//                        line ++ ;
//                    }
//                    reader.close(); {"message":"success","result":[{"surveyid":"1","surveyname":"B"},{surveyid":"2","surveyname":"C"}]}
                    
        }else{
            System.out.println("找不到指定的文件");
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return jdata;
     
    }
 
//	public static List<SurveyVO> getdata(){
//		   //sTotalString = {"message":"success","result":[{"surveyid":"1","surveyname":"B"}{surveyid":"2","surveyname":"C"}]};  
//	    JSONObject json; 
//	    List<SurveyVO> surveyVOList=new ArrayList<SurveyVO>();
//	     try {  
//	    	  String filePath = "D:\\jdata.txt";
//	         String sTotalString= readTxtFile(filePath);
//	          
//		     json = new JSONObject(sTotalString);  
//		     JSONArray results = json.getJSONArray("result");  
//		     for (int i = 0; i < results.length(); i++) { 
//		    	 
//			     SurveyVO surveyVO = new SurveyVO(); 
//			     
//			     JSONObject result = results.getJSONObject(i);  
//			     System.out.println(result.getString("surveyId")+"  "+result.getString("surveyName"));  
//			     surveyVO.setSurveyId(result.getString("surveyId"));  
//			     surveyVO.setSurveyName(result.getString("surveyName"));  
//
//
//				surveyVOList.add(surveyVO);  
//				
//		     }  
//	     } catch (JSONException e) {  
//	    	 e.printStackTrace();  
//	     } 
//	     return surveyVOList;
//	     
//	}
}  