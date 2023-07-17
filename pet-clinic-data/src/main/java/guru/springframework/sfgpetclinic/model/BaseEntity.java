package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    //Getter and Setter per Id , quindi l'entità che dovranno essere serializzate dovranno estendere quetsa classe
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
