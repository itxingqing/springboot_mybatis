package com.jzzx;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 
/**
 * @Package: com.frankxulei 
 * @ClassName: Application  
 * @Description: 应用启动
*/
@SpringBootApplication
public class Application implements CommandLineRunner {

 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("家政在线启动运行中....");
	}
}