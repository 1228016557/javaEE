package itheima06;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//
public class Demo01 {
    public static void main(String[] args) throws  IOException {
/*                Properties pps = new Properties();
                pps.load(new FileInputStream("day15\\src\\itheima06\\ZZ.properties"));
                Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
                while(enum1.hasMoreElements()) {
                    String strKey = (String) enum1.nextElement();
                    String strValue = pps.getProperty(strKey);
                    System.out.println(strKey + "=" + strValue);
                }     //name=JJWeight=4444 Height=3333*/
       //把配置文件中的信息放到prop中
        Properties prop = new Properties();
        FileReader fr = new FileReader("day15\\src\\itheima06\\ZZ.properties");
        prop.load(fr);
      //遍历
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key+"="+value);
        }


    }

    }

