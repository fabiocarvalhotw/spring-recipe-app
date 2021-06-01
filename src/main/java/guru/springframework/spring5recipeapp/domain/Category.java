package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;
import java.util.Set;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    //endregion

}
