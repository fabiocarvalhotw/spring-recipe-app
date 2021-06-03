package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

//Todo - Create loader
//Create a data load instead of using database.

@Data
@Entity
public class Ingredient {

    public Ingredient() {

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }


    //region .: Properties :.

    private String description;
    private BigDecimal amount;

    //region .: Mapping Relationship

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(fetch = FetchType.EAGER) //Eager trás a propriedade toda hora do banco de dados.
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    //endregion


    //endregion


}
