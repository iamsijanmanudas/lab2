package lab2.udas.lab2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Model {
    HashMap<Integer, Profile> profiles;
    HashMap<Integer, Posting> postings;

    private static Integer nextProfileId = 100;
    private static Integer nextPostingId = 100;
    /*
     * Create a Model class that manages a Profile collection and a Posting collection. The Model class should include the
following fields:
• HashMap<Integer, Profile>
• HashMap<Integer, Posting>
Add the following methods to the Model class:
• Profile addProfile(Profile profile) initializes profileId and adds profile to profiles collection,
• Posting addPost(Posting posting) initializes postingId, sets the current date and time of the posting,
and adds the posting to the postings collection,
• List<Profile> getProfiles() returns a list of all profiles,
• List<Posting> getPostings() returns a list of all postings,
• Profile getProfileById(Integer id) returns the profile with requested id (or null),
• Posting getPostingById(Integer id) returns the posting with requested id (or null).
     */

    public Model() {
        super();
        profiles = new HashMap<>();
        postings = new HashMap<>();
    }

    //POST
    public Posting addPost(Posting posting) {
        posting.setPostingId(nextPostingId++);
        posting.setDateandTime(LocalDateTime.now());
        postings.put(posting.getPostingId(), posting);
        return posting;
    }

    //get by id
    public Profile getProfileById(Integer id) {
        return profiles.get(id);
    }
    public Posting getPostingById(Integer id) {
        return postings.get(id);
    }
    public List<Profile> getProfiles() {
        return new ArrayList<>(profiles.values());
    }

    public List<Posting> getPostings() {
        return new ArrayList<>(postings.values());
    }

    public Profile addProfile(Profile profile) {
        profile.setProfileId(nextProfileId++);
        profiles.put(profile.getProfileId(), profile);
        return profile;
    }
}
