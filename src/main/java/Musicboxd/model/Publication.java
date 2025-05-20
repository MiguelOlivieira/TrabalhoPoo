package Musicboxd.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class Publication{



  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PublicationId;

    @ElementCollection
    private List<String> publication;

    public String comment;
    public int rating;
    public boolean liked;

    public int indexPublication;


}
