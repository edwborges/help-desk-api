package helpdesk.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import helpdesk.models.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_cliente")
public class Cliente extends Pessoa {

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        setPerfis(Perfil.CLIENTE);
    }

    public Cliente(Long id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        setPerfis(Perfil.CLIENTE);
    }
}