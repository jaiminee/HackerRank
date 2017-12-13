//package com.example.Login;

import java.util.HashMap;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

public class MemCacheUtils {

    //private static final Logger logger = LogManager.getLogger(MemCacheUtil.class);
    private static MemCachedClient client = null;
    

    public static void main(String[] args) {
        String[] servers = { "localhost:11211" };
        SockIOPool pool = SockIOPool.getInstance("test");
        pool.setServers(servers);
        pool.setFailover(true);
        pool.setInitConn(1000);
        pool.setMinConn(5000);
        pool.setMaxConn(25000);
        pool.setMaxIdle( 18000 );
        pool.setMaintSleep(300);
        pool.setNagle(false);
        pool.setSocketTO(3000);
        pool.setAliveCheck(true);
        pool.initialize();
        client = new MemCachedClient("test");
        
      //add some value in cache
  		System.out.println("add status:"+client.add("1", "Original"));
  		//Get value from cache
  		System.out.println("Get from Cache:"+client.get("1"));

  		System.out.println("add status:"+client.add("1", "Modified"));
  		System.out.println("Get from Cache:"+client.get("1"));

  		//use set function to add/update value, use replace to update and not add
  		System.out.println("set status:"+client.set("1","Modified"));
  		System.out.println("Get from Cache after set:"+client.get("1"));

  		//use delete function to delete key from cache
  		System.out.println("remove status:"+client.delete("1"));
  		System.out.println("Get from Cache after delete:"+client.get("1"));
        
    }
  
}