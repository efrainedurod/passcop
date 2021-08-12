package com.passcop.source.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.passcop.source.model.Vpersona;

@Stateless
public class VpersonaDao extends AbstractFacade<Vpersona> {

	private static final long serialVersionUID = 1L;

	public VpersonaDao() {
		super(Vpersona.class);
	}

	@Override
	public void configure(String filter) {
		initialize();

	}

	@SuppressWarnings("unchecked")
	public List<Vpersona> findAllByIdentificacion(String identificacion) {
		try {
			initialize();
			CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
			CriteriaQuery<Vpersona> criteriaQuery = cb.createQuery(Vpersona.class); 
			Root<Vpersona> root = criteriaQuery.from(Vpersona.class);
			criteriaQuery.where(cb.equal(root.get("identificacion"), identificacion));
			Query query = getEntityManager().createQuery(criteriaQuery);
			return query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 

}
