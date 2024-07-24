package dao;

import br.com.projetoalura.modelos.Categoria;
import br.com.projetoalura.modelos.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {


    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public  void atualziar(Produto produto) {
        this.em.merge(produto);
    }
    public void remover(Categoria categoria) {
        categoria = em.merge(categoria);
        this.em.remove(categoria);
    }
    public Produto buscarPorId(int id) {
        return this.em.find(Produto.class, id);
    }
    public List<Produto> buscarTodos() {
        String jpql = " SELECT p FROM Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }
    public List<Produto> buscarPorNome(String nome) {
        String jpql = " SELECT p FROM Produto p WHERE p.nome = :nome";
        return em.createQuery(jpql, Produto.class).setParameter("nome", nome).getResultList();
    }

}
