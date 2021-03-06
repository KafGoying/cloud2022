package com.lykj.springcloud;

import com.lykj.springcloud.service.EmailService;
import com.lykj.springcloud.service.impl.EmailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmailTest {

    @Autowired
    private EmailServiceImpl emailService;

    @Test
    public void sendSimpleEmail(){
        String content = "你好，恭喜你...";
        emailService.sendSimpleMail("john.gao@leiyankeji.com","祝福邮件",content);
    }

    @Test
    public void sendMimeEmail(){
        String content = "<a href='https://blog.csdn.net/'>你好，欢迎注册网站，请点击链接激活</a>";
        emailService.sendHtmlMail("john.gao@leiyankeji.com","激活邮件",content);
    }

    @Test
    public void sendAttachment(){
        emailService.sendAttachmentsMail("john.gao@leiyankeji.com","发送附件","爱旅行","F:\\图片\\爱旅行.jpg");
    }
}