/*package com.service.jaxrs.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.service.jaxrs.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
    private Session getSession(){		
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean createUser(User user) {
		try{
		getSession().save(user);
		return true;
		}
		catch(Exception e){
		return false;
		}
	}

	@Override
	public void deleteUser(User user) {
		getSession().delete(user);
	}

	@Override
	public User getUser(long userID) {
		User user=(User) getSession().get(User.class, userID);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
			
		return getSession().createQuery("from User").list();// write exact class Name for table name in hql 
		Criteria criteria = getSession().createCriteria(User.class);
		List<User> list=criteria.list();
		//return list;		
	}



	@Override
	public boolean deleteAllUser() {
		// write exact class Name for table name in hql
		Query query=getSession().createQuery("delete from User");
		int i=query.executeUpdate();
		if(i>0)
			return true;
		return false;
		
	}
  
}
*/