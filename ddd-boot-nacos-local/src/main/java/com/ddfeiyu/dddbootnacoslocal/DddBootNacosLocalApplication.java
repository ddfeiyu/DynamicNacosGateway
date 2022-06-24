package com.ddfeiyu.dddbootnacoslocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * nacos启动类： 仅本地开发用
 *
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@ServletComponentScan
@EnableScheduling
public class DddBootNacosLocalApplication {


	/**
	 * 是否单机模式启动
	 */
	private static String standalone = "true";

	/**
	 * 是否开启鉴权
	 */
	private static String enabled = "false";

	public static void main(String[] args) {
		System.setProperty("nacos.standalone", standalone);
		System.setProperty("nacos.core.auth.enabled", enabled);
		System.setProperty("server.tomcat.basedir","logs");
		System.setProperty("server.port","8848");//自定义启动端口号
		SpringApplication.run(DddBootNacosLocalApplication.class, args);
	}

	/**
	 * 首页跳转:视图重定向
	 * @param model
	 * @param response
	 * @return
	 */
	@GetMapping("/")
	public String index(Model model, HttpServletResponse response) {
		return "/nacos";
	}


}
