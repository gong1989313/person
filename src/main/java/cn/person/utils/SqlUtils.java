package cn.person.utils;

import java.util.ArrayList;
import java.util.List;

public class SqlUtils {
	public static void doQuery(String test ,String uname, String uage){  
        boolean hasWhere = false;  
        List<Object> pars = new ArrayList<Object>();  
        StringBuilder sql = new StringBuilder("select * from users");
        int i = 0;
        if(test != null){  
        	i++;
            hasWhere = appendWhereIfNeed(sql, hasWhere);  
            sql.append("test like ?" + i);
            pars.add('%'+ test +'%');
        }  
        if(uname != null){  
        	i++;
            hasWhere = appendWhereIfNeed(sql, hasWhere);  
            sql.append("uname like ?" + i);
            pars.add('%'+ uname +'%');
        }if(uage != null){  
        	i++;
            hasWhere = appendWhereIfNeed(sql, hasWhere);  
            sql.append("uage = ?" + i);
            pars.add(uage);
        }  
        System.out.println(sql.toString());
        //executeSql(sql);  
    }  
      
    private static boolean appendWhereIfNeed(StringBuilder sql,Boolean hasWhere){  
        if(hasWhere == false){  
            sql.append(" where ");
            hasWhere = true;
        }else{  
            sql.append(" and "); 
            hasWhere=false;
        }  
        return hasWhere;
    } 
    
    public static void main(String[] args) {
    	doQuery("ddd", null, "ddd");
	}
    
/*    public void newthink(){
    	 StringBuilder sqlAppender = new StringBuilder("select * from tableName where 1=1 ");
    	    if(!String.IsNullOrEmpty("searchEntity.UserName))
    	    {
    	        sqlAppender.Append(" and userName=" + searchEntity.UserName);
    	    }
    	    string sql = sqlAppender.ToString();
    	    //
    	    // 这这里写正则表达式来验证吧！
    	    //
    	    SQLHelper.ExecuteQueryToTable(sql);
    }*/
   
}
