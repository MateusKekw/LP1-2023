import entity.Endereco;
import entity.Pessoa;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Endereco casa = new Endereco("Francisco", "SP");
        Endereco trab = new Endereco("Gasques", "GRU");
        Endereco avo = new Endereco("Rodriguez", "RJ");

        Pessoa killer  = new Pessoa("KILLER", "Frost", "r.munoz@gmail", casa);
        Pessoa milhomenes = new Pessoa("calvomem", "Peranha", "aaa@bbb", trab);
        Pessoa rony = new Pessoa("rustico", "quentinho", "p.mafra", avo);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction =  session.beginTransaction();

        session.persist(killer);
        session.persist(milhomenes);
        session.persist(rony);
        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p));
    }

    public void gerenciar_pedidos(){

    }
}
