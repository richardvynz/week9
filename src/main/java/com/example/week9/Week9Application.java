package com.example.week9;

import com.example.week9.models.BlogUser;
import com.example.week9.repository.BlogUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@SpringBootApplication
public class Week9Application {

   private final BlogUserRepository blogUserRepository;

    public static void main(String[] args) {
        SpringApplication.run(Week9Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(){
//        return args -> {
//            BlogUser Admin = new BlogUser(
//                    "Vincent",
//                    "Present",
//                    "decadev@dev.com",
//                    "1234");
//            blogUserRepository.save(Admin);
//        };
//    }

}

//echo "# week9" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/richardvynz/week9.git
//        git push -u origin main
