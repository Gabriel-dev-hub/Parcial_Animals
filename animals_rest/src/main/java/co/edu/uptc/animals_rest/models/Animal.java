package co.edu.uptc.animals_rest.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {
    private String name;
    private String category;
    private String host;
    private Date date;
}
