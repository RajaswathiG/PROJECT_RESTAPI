package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepo;
@Service
public class UserService {
	@Autowired
	UserRepo cr;
	public UserModel saveinfo(UserModel cm)
	{
		return cr.save(cm);

	}

	public List<UserModel> saveninfo(List<UserModel> cm)

	{

		return (List<UserModel>)cr.saveAll(cm);

	}

	public List<UserModel> showinfo()

	{

		return cr.findAll();

	}

	public Optional<UserModel> showbyid(int custid)

	{

		return cr.findById(custid);

	}

	public UserModel changeinfo(UserModel cm)

	{

		return cr.saveAndFlush(cm);

	}

	public String updateinfobyid(int custid,UserModel cm)

	{

		cr.saveAndFlush(cm);

		if(cr.existsById(custid))

		{

			return "Updated";

		}

		else

		{

			return "Enter valid id";

		}

	}

	public void deleteinfo(UserModel cm)

	{

		cr.delete(cm);

	}

	public void deleteid(int custid)

	{

		cr.deleteById(custid);

	}

	public List<UserModel> sortinfo(String s)

	{

		return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION, s));

	}

	public List<UserModel> getbypage(int pagno,int pagsize)

	{

		Page<UserModel> p=cr.findAll(PageRequest.of(pagno, pagsize));

		return p.getContent();

	}

	public List<UserModel> getpage(int pagno,int pagsize)

	{

		PageRequest pq=PageRequest.of(pagno, pagsize,Sort.by("custname").descending());

		Page<UserModel> pm=cr.findAll(pq);

		return pm.getContent();
	}

	public List<UserModel> getcust(int s,String b)
	{
		return cr.getcustinfo(s, b);
	}
	public Integer deletecust(int s)
	{
		return cr.deletecustinfo(s);
	}
	public int  updatecust(int id,int id1)
	{
		return cr.updatecustinfo(id, id1);

	}

}