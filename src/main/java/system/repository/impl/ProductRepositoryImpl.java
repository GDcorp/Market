package system.repository.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import system.entity.ProductEntity;
import system.repository.ProductRepository;
import system.utils.HibernateUtil;

import java.util.List;

/**
 * Created by Qubo on 21.06.2017.
 */
public class ProductRepositoryImpl implements ProductRepository {
    public List<ProductEntity> getProducts() {
        List<ProductEntity> result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(ProductEntity.class);
            result = (List<ProductEntity>) criteria.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("123");
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }
}
