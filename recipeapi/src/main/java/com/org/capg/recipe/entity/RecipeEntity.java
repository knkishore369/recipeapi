package com.org.capg.recipe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "recipe")
public class RecipeEntity {

    /**
     * The id.
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * The create date
     */
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date creationDate = new Date();

    /**
     *  The dish type.
     */
    @Column(name = "dish_type")
    @NotNull(message = "Please enter type of the dish.")
    private String dishType;

    /**
     * The number of people.
     */
    @Column(name = "num_of_people")
    @NotNull(message = "Please enter number of people.")
    private int numOfPeople;

    /**
     * The ingredients.
     */
    @Column(name = "ingredients")
    @NotNull(message = "Please enter ingredients.")
    private String ingredients;

    /**
     * The cooking instruction.
     */
    @Column(name = "cooking_instruction")
    @NotNull(message = "Please enter cooking instructions.")
    private String cookingInstruction;
}
