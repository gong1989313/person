package cn.person.utils;

import java.util.HashMap;

public class EHCacheUtils {

	private static HashMap<Integer, Object> sessionMap = new HashMap<Integer, Object>();
	
	
	public static void addToMap(int seriesid, Object Object){
		if(sessionMap.size()>150){
			clearObjectMap();
		}
		if(!sessionMap.containsKey(seriesid)){
			sessionMap.put(seriesid, Object);
		}
	}
	
	public static Object getObject(int seriesid){
		if(sessionMap.containsKey(seriesid)){
			Object Object = sessionMap.get(seriesid);
			return Object;
		}else{
			return null;
		}
	}
	
	public static void clearObjectMap(){
		sessionMap.clear();
	}
	
	
}
