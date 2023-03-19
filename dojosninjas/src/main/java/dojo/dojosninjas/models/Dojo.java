package dojo.dojosninjas.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dojo") // should be plural in convention

public class Dojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)    //annotation Dojo will have a list of ninja
    private List<Ninja> ninjas;
    

    // **Generate Empty Constructor**

    public Dojo() {
    }

    public Dojo(Long id, String name, List<Ninja> ninjas) {
        this.id = id;
        this.name = name;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ninja> getNinjas() {
        return this.ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

}
