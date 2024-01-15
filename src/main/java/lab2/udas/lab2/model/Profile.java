package lab2.udas.lab2.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Profile {
    

/*
ate a Profile class that represents a user profile. The Profile class should include the following fields and methods:
• Integer profileId,
• String userName,
• List<Posting> postings,
• NoArgs constructor,
• Profile(String userName) Constructor that initializes profile user name.
• Get and Set methods,
• AddPosting(Posting posting). Adds a posting to the user's postings list.
*/

    private Integer profileId;
    private String userName;
    private List<Posting> postings;

    public Profile(String userName) {
        this.userName = userName;
        postings=new ArrayList<>();
    }


    public void addPosting(Posting posting) {
        postings.add(posting);
    }
}
