package lab2.udas.lab2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Posting {
 /*
 Integer postingId,
• String postingText,
• LocalDate date,
• LocalTime time,
• String username.
• NoArgs constructor,
• Get and Set methods,
 */   
    private Integer postingId;
    private String postingText;
    private LocalDate date;
    private LocalTime time;
    private String username;

    public Posting(String postingText, LocalDate date, LocalTime time, String username) {
        this.postingText = postingText;
        this.date = date;
        this.time = time;
        this.username = username;
    }
    public void setDateandTime(LocalDateTime dateTime){
        this.date=dateTime.toLocalDate();
        this.time=dateTime.toLocalTime();
    }

}
