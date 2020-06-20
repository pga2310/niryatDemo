package com.niryat.demo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
	
//	@Autowired
//	private StudentInterface studentInterface;
	
	List<User> userList = new ArrayList<User>();
	int id = 0;
	public List<User> getAllStudents() {
		// TODO Auto-generated method stub
//		List<User> list = new ArrayList<>();
//		studentInterface.findAll().forEach(list :: add);
//		return list;
		
		
		return userList;
	}

	public User getStudent(int id) {
		// TODO Auto-generated method stub
//		return studentInterface.findOne(id);
		
		for(User u: userList){
			if(u.getId() == id) return u;
		}
		return null;
	}
	
	public User getStudentByUsername(String username) {
		// TODO Auto-generated method stub
//		return studentInterface.findOne(username);
		
		for(User u: userList){
			if(u.getUsername().equals(username)) return u;
		}
		return null;
	}

	public void addStudent(User username) {
		// TODO Auto-generated method stub
//		studentInterface.save(username);
		username.setId(id++);
		userList.add(username);
	}

	public void updateStudent(String id, User user) {
		// TODO Auto-generated method stub
//		studentInterface.save(user);
		
		for(User u: userList){
			if(u.getUsername().equals(user.getUsername())) {
				u.setCity(user.getCity());
				u.setName(user.getName());
				u.setZipcode(user.getZipcode());
				u.setState(user.getState());
				u.setPassword(user.getPassword());
				break;
			}
		}
	}

	public void removeStudent(int id) {
		// TODO Auto-generated method stub
//			studentInterface.delete(id);
		for(User u: userList){
			if(u.getId()==id) {userList.remove(u); return;}
		}
	}

}
