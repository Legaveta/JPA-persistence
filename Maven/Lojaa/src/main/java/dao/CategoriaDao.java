package dao;

import br.com.projetoalura.modelos.Categoria;
import br.com.projetoalura.modelos.Produto;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

}
