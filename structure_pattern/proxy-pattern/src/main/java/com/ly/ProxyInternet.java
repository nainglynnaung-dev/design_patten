package com.ly;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private static List<String> bannLists;
    private Internet internet=new RealInternet();


    static {
        bannLists=new ArrayList<>();
        bannLists.add("www.baidu.com");
        bannLists.add("www.qq.com");
    }



    @Override
    public void connectTo(String host) throws Exception {
          if (bannLists.contains(host.toLowerCase())){
              throw new Exception("Host is banned");
          }
          internet.connectTo(host);
    }
}
