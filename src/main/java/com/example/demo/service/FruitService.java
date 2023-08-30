//package com.example.demo.service;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//
//import com.example.demo.Model.FruitModel;
//import com.example.demo.Repository.FruitRepo;
//
//@Service
//public class FruitService {
//@Autowired
//FruitRepo fr;
//
//public FruitModel fadd (FruitModel fs)
//{
//	return fr.save(fs);
//}
//public List<FruitModel> fsave(List<FruitModel> fs)
//{
//	return (List<FruitModel>)fr.saveAll(fs);
//}
//public List<FruitModel> fshow()
//{
//	return fr.findAll();
//}
//public FruitModel fchange(FruitModel fs)
//{
//	return fr.saveAndFlush(fs);
//}
//public String updatefinfo(int fid,FruitModel fs)
//{
//	fr.saveAndFlush(fs);
//	
//	if(fr.existsById(fid))
//	{
//		return "Updated successfully";
//	}
//	else
//	{
//		return "Invalid id";
//	}
//}
//public void fdelete(int fid)
//{
//	fr.deleteById(fid);
//}
//public List<FruitModel> sortinfo(String s)
//{
//return fr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
//}
//public List<FruitModel> getbypage(int pgno,int pgsize)
//
//{
//	Page<FruitModel> p= fr.findAll(PageRequest.of(pgno, pgsize));
//	
//	
//	return p.getContent();
//}
//
//public List<FruitModel> getSortedAndPagedData(int pgno, int pgsize, String sortProperty) {
//    Sort.Direction sortDirection = Sort.Direction.ASC; // Default to ascending order
//    Page<FruitModel> p = fr.findAll(PageRequest.of(pgno, pgsize,Sort.by(sortDirection, sortProperty)));
//    return p.getContent();
//}
//
//public List<FruitModel> getfn(String b)
//{
//	return fr.getfname(b);
//}
//public List<FruitModel> getfp(long p)
//{
//	return fr.getfprice(p);
//}
//public List<FruitModel> getfnp(String b,long p)
//{
//	return fr.getfnameprice(b,p);
//}
//public int delDetails (String s)
//{
//	return fr.delInfo(s);
//}
//public int updatedetails (int id,int id1)
//{
//	return fr.updateInfo(id,id1);
//}   
//
//
//
//
//
//
//
//
//
//
//}