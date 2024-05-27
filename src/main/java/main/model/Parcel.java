package main.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "`parcel`")
@Data


public class Parcel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String numCadastr;

}
