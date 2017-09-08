package cn.teaey.sprintboot.test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
