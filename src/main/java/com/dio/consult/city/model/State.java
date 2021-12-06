package com.dio.consult.city.model;

        import com.fasterxml.jackson.annotation.JsonSubTypes;
        import org.hibernate.annotations.Type;
        import org.hibernate.annotations.TypeDef;
        import org.hibernate.annotations.TypeDefs;

        import javax.persistence.*;
        import java.util.List;

@Entity
@Table(name = "estado")

public class State {

    @Id
    private  Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    @ManyToOne
    private Country pais;

    @Type(type="jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;
}
