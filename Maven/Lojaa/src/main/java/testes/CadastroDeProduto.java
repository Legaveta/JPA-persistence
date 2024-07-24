package testes;

import br.com.projetoalura.modelos.Categoria;
import br.com.projetoalura.modelos.Produto;
import dao.CategoriaDao;
import dao.ProdutoDao;
import util.JPAUtil;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CadastroDeProduto {
    public static void main(String[] args) {

        CadastrarProduto();
        int id = 1;
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtodao = new ProdutoDao(em);

        Produto p = produtodao.buscarPorId(1);
        System.out.println(p.getPreço());
        List<Produto> todos = produtodao.buscarTodos();

        todos.forEach(p2 -> System.out.println(p.getNome()));

        List<Produto> nome = produtodao.buscarPorNome("celular");


    }

    private static void CadastrarProduto() {
        Categoria celulares = new Categoria("Celulares");

        //Produto celular = new Produto("celular2", "celular2", 900 , celulares);
        //celular.setNome("celular");
        //celular.setDescricao("celular");
        //celular.setPreço(200);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtodao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        //categoriaDao.cadastrar(celulares);
        //produtodao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}