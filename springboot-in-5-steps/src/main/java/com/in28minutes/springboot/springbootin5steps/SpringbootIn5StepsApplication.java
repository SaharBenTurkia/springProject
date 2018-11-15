package com.in28minutes.springboot.springbootin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn5StepsApplication {

	public static void main(String[] args) {
		/*System.getProperties().put( "server.port", 80 );
		SpringApplication.run(SpringbootIn5StepsApplication.class, args);
		*/
		ApplicationContext appContext = SpringApplication.run(SpringbootIn5StepsApplication.class, args);	
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6},3);
		System.out.println(result);
	}
}
