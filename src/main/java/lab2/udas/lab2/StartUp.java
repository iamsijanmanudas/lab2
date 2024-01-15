package lab2.udas.lab2;

import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import lab2.udas.lab2.model.Model;
import lab2.udas.lab2.model.Posting;
import lab2.udas.lab2.model.Profile;

@Component
public class StartUp implements CommandLineRunner {

   Model model;
   final Integer MIN_PROFILES =2;
   final Integer MIN_POSTS =2;
   final Integer MAX_POSTS = 8;
   final Integer MAX_PROFILES =10;
    Lorem lorem = LoremIpsum.getInstance();


@Override
public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
    Random random = new Random();
    Integer nProfiles = MIN_PROFILES + random.nextInt(MAX_PROFILES-MIN_PROFILES);
    

    for (int profileCount = 0; profileCount < nProfiles; profileCount++) {
        Profile profile = new Profile(lorem.getFirstName());
        Integer nPosts = MIN_POSTS + random.nextInt(MAX_POSTS-MIN_POSTS);

        for (int postingCount = 0; postingCount < nPosts; postingCount++) {
                Posting posting = new Posting();
                posting.setUsername(profile.getUserName());
                posting.setPostingText(lorem.getWords(10 + random.nextInt(MAX_POSTS - MIN_POSTS)));
                model.addPost(posting);
                profile.addPosting(posting);
        }
        model.addProfile(profile);



    }
}

public StartUp(Model model) {
    this.model = model;
}
   
   
    
}
