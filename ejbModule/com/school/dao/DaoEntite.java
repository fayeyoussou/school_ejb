package com.school.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.school.entities.Course;

public abstract class DaoEntite<T, ID extends Serializable> {

    @PersistenceContext(unitName = "GestionSchool_UP")
    protected EntityManager em;

    public T save(T entity) {
        try {
            em.persist(entity);
            return entity;
        } catch (Exception e) {
            throw e;
        }
    }

    public T delete(ID id) {
        T entity = em.find(getTypeClass(), id);
        if (entity != null) {
            em.remove(entity);
            return entity;
        }
        return null;
    }

    public T edit(T entity) {
        try {
            return em.merge(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    public T getById(ID id) {
        return em.find(getTypeClass(), id);
    }

    public List<T> filterByFieldName(String fieldName, Object value) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getTypeClass());
        Root<T> root = query.from(getTypeClass());
        query.where(builder.equal(root.get(fieldName), value));
        return em.createQuery(query).getResultList();
    }

//    public List<T> findAll() {
//        try {
//            return em.createQuery("Select p From Course p").getResultList();
//        } catch (Exception e) {
//            throw e;
//        }
//    }
    public List<T> list() {
        CriteriaQuery<T> criteria = em.getCriteriaBuilder().createQuery(getTypeClass());
        criteria.select(criteria.from(getTypeClass()));
        return em.createQuery(criteria).getResultList();
    }

    protected abstract Class<T> getTypeClass();
}


