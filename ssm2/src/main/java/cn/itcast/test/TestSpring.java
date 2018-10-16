package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void run1(){
        //读取配置文件,获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取service对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        //调用方法
        accountService.findAll();


    }
}
