package view;

import model.ModelException;
import model.dao.DAOFactory;
import model.dao.UserDAO;
import model.entities.User;
import model.dao.PostDAO;
import model.entities.Post;

public class Main {
	public static void main(String[] args) {
//		User emerson = new User(7);
//		emerson.setName("Emerson DAO Novo");
//		emerson.setEmail("emerson.novo@mail.com");
//		emerson.setSex('M');
		
		PostDAO dao = (PostDAO) DAOFactory.getDAO(PostDAO.class);
		
		Post post = null;
		try {
			post = dao.findById(5);
		} catch (ModelException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
			e.getCause().printStackTrace();
		}
		
		if (post != null) {
			System.out.println("Id: " + post.getId());
			System.out.println("Content: " + post.getContent());
			System.out.println("Data: " + post.getDate());
			System.out.println("User Id: " + post.getUser().getId());
			System.out.println();
		}

	}
}
