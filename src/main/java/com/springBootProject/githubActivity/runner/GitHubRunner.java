package com.springBootProject.githubActivity.runner;


import com.springBootProject.githubActivity.service.GithubActivitySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import reactor.core.publisher.Mono;
import tools.jackson.databind.ObjectMapper;

import java.util.Scanner;

@Component
public class GitHubRunner implements CommandLineRunner {

    @Autowired
    GithubActivitySevice githubActivitySevice;

    private ObjectMapper mapper=new ObjectMapper();
    @Autowired
    private View error;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to GitActivity");
        System.out.println();
        System.out.println("Please enter you userName");
        Scanner sc=new Scanner(System.in);
        String userName=sc.nextLine();
        Mono<String> mono=githubActivitySevice.getApi(userName);
        mono.subscribe(data->{
            try{

                Object objectData=mapper.readValue(data,Object.class);
                String stringData=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectData);
                System.out.println(stringData);


            } catch (Exception e) {
                throw new RuntimeException(e);
            }



        },error->{System.out.println("Error fetching details"+error.getMessage());});

    }
}
