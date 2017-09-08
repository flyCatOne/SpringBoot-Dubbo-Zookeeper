package cn.teaey.sprintboot.test;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str);
        return "hello";
    }
}
