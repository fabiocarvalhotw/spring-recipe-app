package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {

    //region .: Properties :.

    private String description;

    //region .: Mapping Relationship :.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    //endregion

    //endregion

    //region .: Getter's and Setter's

    //endregion

}
