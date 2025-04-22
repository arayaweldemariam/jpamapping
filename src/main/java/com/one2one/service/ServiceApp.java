package com.one2one.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.one2one.entities.Address;
import com.one2one.entities.Student;
import com.one2one.repository.AddressRepository;
import com.one2one.repository.StudentRepository;
import jakarta.transaction.Transactional;

@Service
public class ServiceApp
{ 
	@Autowired
	private StudentRepository sturepo;
		@Autowired
	private AddressRepository addrepo;
	
	
	  @Transactional
	public void savedata()
	{
		Student stu=new Student("araya",9283492);
		Address add=new Address("qera","addis","oromia");
		sturepo.save(stu);
		addrepo.save(add);
	}
}
