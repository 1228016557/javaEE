package itheima01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
static InetAddress getByName(String host)确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
String getHostName()获取此IP地址的主机名
String getHostAddress()返回文本显示中的IP地址字符串
 */
public class IP01 {
    public static void main(String[] args) throws UnknownHostException {
        //确定主机名称的IP地址
        InetAddress adress = InetAddress.getByName("192.168.13.50");
            //获取主机名
        String hostName = adress.getHostName();
        //获取ip地址
        String ip = adress.getHostAddress();
        System.out.println("主机名:"+hostName);  //主机名:DESKTOP-0LKHRMT
        System.out.println("ip地址:"+ip);   //ip地址:192.168.13.50
    }
}
