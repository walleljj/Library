/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Reader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author 绘梦
 */
public class MangerReader {
    /**
     * 判断是否可以添加读者
     * */
    public static boolean couldAdd(Reader reader) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readers.txt"));
        HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        Set<String> key = map.keySet();
        if(key.contains(reader.getId())){
           return false; 
        }else return true;       
    }
    /**
     * 增加读者
     **/
    public static  void addReader(Reader reader)throws Exception{
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
      HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
     //   HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        map.put(reader.getId(),reader);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reader.txt"));
        oos.writeObject(map);
        oos.close();     
    }
    /**
	 *判断是否可以删除读者
     **/
    public static boolean couldDelet(Reader reader) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
        HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        Set<String> key = map.keySet();
        if(key.contains(reader.getId())){
           return true; 
        }else return false;       
    }
     	/**
	     * 删除读者
	     **/
    public static void deletReader(String id )throws Exception{
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
		HashMap<String, Reader> map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        map.remove(id);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reader.txt"));
        oos.writeObject(map);
        oos.close();     
    }
     /**
     * 更改读者
     */
    public static void changeReader(Reader reader)throws Exception{
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
        HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        map.remove(reader.getId());
        map.put(reader.getId(),reader);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reader.txt"));
        oos.writeObject(map);
        oos.close();     
    }
    /**
     判断是否存在读者信息*/
    public static boolean isHave(String id) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
        HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close();
        Set<String> key = map.keySet();
        if(key.contains(id)){
           return true; 
        }else return false;       
    }
    
   public static boolean isLogin(String pass,String id) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
        HashMap<String ,Reader>  map = (HashMap<String ,Reader>)ois.readObject();
        ois.close(); 
        if(map.get(id).getPassword().equals(pass)){
            return true;
        }else 
            return false;
    
   }
}
    

