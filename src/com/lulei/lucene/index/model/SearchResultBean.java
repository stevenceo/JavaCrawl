/** 
**com.lulei.lucene.index.model.SearchResultBean 
**/  
/** 
 * @Description:  ��������������ݽṹ 
 */  
package com.lulei.lucene.index.model;  

import java.util.List;  

import org.apache.lucene.document.Document;  

public class SearchResultBean {  
    private int count;  
    private List<Document> datas;  
      
    public int getCount() {  
        return count;  
    }  
    public void setCount(int count) {  
        this.count = count;  
    }  
    public List<Document> getDatas() {  
        return datas;  
    }  
    public void setDatas(List<Document> datas) {  
        this.datas = datas;  
    }  
}  