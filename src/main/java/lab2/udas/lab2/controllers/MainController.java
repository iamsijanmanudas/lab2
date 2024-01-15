package lab2.udas.lab2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab2.udas.lab2.model.Model;
import lab2.udas.lab2.model.Posting;
import lab2.udas.lab2.model.Profile;

@RestController
@RequestMapping("/api")
public class MainController {
    /*Create a RestController that implements the following GET request endpoints:
• /api/profiles Return all profiles
• /api/profiles/{profileId} Return the profile with matching profileId
• /api/profiles/{profileId}/postings Return the postings made by the profile with matching profileId. */

Model model;

public MainController(Model model) {
    this.model = model;
}

@GetMapping("/profiles")
public List<Profile> getProfiles() {
    return model.getProfiles();
}
//url for this is http://localhost:8080/api/profiles/100
@GetMapping("/profiles/{profileId}")
public Profile getProfileById(@PathVariable Integer profileId) {
    return model.getProfileById(profileId);
}

//Return the postings made by the profile with matching profileId.
@GetMapping("/profiles/{profileId}/postings")
public List<Posting> getPostingsById(@PathVariable Integer profileId) {
    List<Posting> postings = model.getPostings();
    List<Posting> postingsById = new ArrayList<>(); // Initialize the list
    // Check for id inside the posting list and only return ones with ID
    for (Posting posting : postings) {
        if (posting.getPostingId() == profileId) {
            postingsById.add(posting);
        }
    }
    return postingsById;
}

// GET request endpoints for /api/profiles Return all profiles


}
