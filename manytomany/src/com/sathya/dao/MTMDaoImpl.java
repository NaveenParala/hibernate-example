package com.sathya.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Author;
import com.sathya.entity.Book;
import com.sathya.util.HibernateUtil;

public class MTMDaoImpl implements  IMTMDao {
		private SessionFactory factory;
		
			public MTMDaoImpl() {
		
				factory=HibernateUtil.getSessionFactory();
		}


/*	@Override
	public void saveBookAndAuthor() {
		Book b1=new Book();
		System.out.println(b1);
		
		b1.setBookId(10101);
		b1.setBookName("java");
	
		Book b2=new Book();
		System.out.println(b2.toString());
		b2.setBookId(10102);
		b2.setBookName("hibernate");
		
		Author a1=new Author();
		a1.setAuthorId(901);
		a1.setAuthorName("A");
	
		Author a2=new Author();
		a2.setAuthorId(902);
		a2.setAuthorName("B");
		
		Author a3=new Author();
		a3.setAuthorId(903);
		a3.setAuthorName("C");
		System.out.println(a3);
		
		Set<Author> authorSet1=new HashSet<>();
		System.out.println(authorSet1);
		authorSet1.add(a1);
		authorSet1.add(a3);
		
		b1.setAuthors(authorSet1);
		Set<Author> authorSet2=new HashSet<>();
		authorSet2.add(a1);
		authorSet2.add(a2);
	
		b2.setAuthors(authorSet2);
		
		Set<Book> books=new HashSet<>();
		
		System.out.println(books);
		
		//books.add(b1);
		//books.add(b2);
		
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(b1);
		session.save(b2);
		tx.commit();
		session.close();
		
	}*/


	@Override
	public void removeAuthorFromBook(int authorId, int bookId) {
		Session session=factory.openSession();
		
		Book b=(Book)session.get(Book.class, bookId);
		
		Set<Author> author=b.getAuthors();
		
		Author auth=(Author)session.get(Author.class, authorId);
		
		Transaction tx=session.beginTransaction();
		author.remove(auth);
		tx.commit();
		session.close();
		
	}

}
