package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Localidade {

    @Id
    private long id;

    //temos aqui um relacionamento coma classe nivel acesso
    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;

}
