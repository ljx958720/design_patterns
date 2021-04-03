package com.ghy.demo3.jdkdynamic;

import com.ghy.demo3.jdkdynamic.Login;
import com.ghy.demo3.jdkdynamic.LoginProxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class LoginProxyTest {
    public static void main(String[] args) {
        LoginInterface loginInterface = (LoginInterface)new LoginProxy().getInstance(new Login());
        loginInterface.login("张三");
        loginInterface.reist("张三");
        // 通过反编译工具可以查看源代码
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{LoginInterface.class});
            FileOutputStream os = new FileOutputStream("F://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
