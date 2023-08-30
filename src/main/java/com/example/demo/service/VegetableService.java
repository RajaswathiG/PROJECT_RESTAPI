//package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Model.VegetableModel;
//import com.example.demo.Repository.VegetableRepo;
//
//@Service
//public class VegetableService {
//@Autowired
//VegetableRepo vr;
//public VegetableModel vadd (VegetableModel vs)
//{
//	return vr.save(vs);
//}
//public List<VegetableModel> vsave(List<VegetableModel> vs)
//{
//	return (List<VegetableModel>)vr.saveAll(vs);
//}
//
//
//public List<VegetableModel> vshow()
//{
//	return vr.findAll();
//}
//
//public VegetableModel vchange(VegetableModel vs)
//{
//	return vr.saveAndFlush(vs);
//}
//
//public void vdelete(int vid)
//{
//	vr.deleteById(vid);
//	
//}
//public List<VegetableModel> sortveg(String s)
//{
//return vr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
//}
//public List<VegetableModel> getbypageveg(int pgno,int pgsize)
//
//{
//	Page<VegetableModel> p= vr.findAll(PageRequest.of(pgno, pgsize));
//	
//	
//	return p.getContent();
//}
//
//public List<VegetableModel> getSortedAndPagedDataveg(int pgno, int pgsize, String sortProperty) {
//    Sort.Direction sortDirection = Sort.Direction.ASC; // Default to ascending order
//    Page<VegetableModel> p = vr.findAll(PageRequest.of(pgno, pgsize,Sort.by(sortDirection, sortProperty)));
//    return p.getContent();
//}
//
//public List<VegetableModel> getvn(String b)
//{
//	return vr.getvname(b);
//}
//public List<VegetableModel> getvp(long p)
//{
//	return vr.getvprice(p);
//}
//public List<VegetableModel> getvnp(String b,long p)
//{
//	return vr.getvnameprice(b,p);
//}
//}