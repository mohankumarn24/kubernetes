package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping({"/", "/message", "/home", "/welcome"})
	public String displayMessage(){
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}
}

/*
 * https://www.youtube.com/watch?v=gMmcRbd8L5Y&list=PLVz2XdJiJQxybsyOxK7WFtteH42ayn5i9&index=11
 * https://github.com/Java-Techie-jt/springboot-crud-k8s
 * https://github.com/Java-Techie-jt/springboot-k8s-yaml
 * 
 * https://medium.com/@javatechie/kubernetes-tutorial-setup-kubernetes-in-windows-run-spring-boot-application-on-k8s-cluster-c6cab8f7de5a
 */
