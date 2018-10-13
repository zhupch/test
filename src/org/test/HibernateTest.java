package org.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;
import org.vo.UserTable;

public class HibernateTest {
	public Session session;
	public static void main(String[] args){
		HibernateTest ht=new HibernateTest();
		ht.getCurrentSession();
		ht.saveUser();
		System.out.println("增加一条记录后结果==========");
		ht.queryUser();
		ht.updateUser();
		System.out.println("修改一条记录后结果==========");
		ht.queryUser();
		ht.deleteUser();
		System.out.println("删除一条记录后结果==========");
		ht.queryUser();
		ht.closeSession();
	}
	public void getCurrentSession(){
		session=HibernateSessionFactory.getSession();
	}
	public void closeSession(){
		if(session!=null)
		{
			HibernateSessionFactory.closeSession();
		}
	}
	public void saveUser(){
		Transaction t1=session.beginTransaction();
		UserTable user=new UserTable();
		user.setUsername("jack");
		user.setPassword("123456");
		session.save(user);
		t1.commit();
	}
	public void updateUser()
	{
		Transaction t2=session.beginTransaction();
		UserTable user=(UserTable)session.get(UserTable.class,7);
		user.setUsername("jack");
		session.update(user);
		t2.commit();
	}
	public void queryUser(){
		try{
			Query query=session.createQuery("from UserTable");
			List list=query.list();
			for(int i=0;i<list.size();i++){
				UserTable user=(UserTable)list.get(i);
				System.out.println(user.getUsername());
				System.out.println(user.getPassword());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void deleteUser(){
		Transaction t3=session.beginTransaction();
		UserTable user=(UserTable)session.get(UserTable.class, 7);
		session.delete(user);
		t3.commit();
	}
}
