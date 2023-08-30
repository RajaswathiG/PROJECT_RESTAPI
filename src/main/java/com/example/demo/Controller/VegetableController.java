//package com.example.demo.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.Model.VegetableModel;
//import com.example.demo.service.VegetableService;
//
//@RestController
//public class VegetableController {
//	@Autowired
//	VegetableService vser;
//	@PostMapping("addveg")
//	public VegetableModel addv(@RequestBody VegetableModel vs)
//	{
//		return vser.vadd(vs);
//	}
//	@PostMapping("manyveg")
//	public List<VegetableModel> addmanyv(@RequestBody List<VegetableModel> vs)
//	{
//		return vser.vsave(vs);
//	}
//	@GetMapping("showveg")
//	public List<VegetableModel> showv()
//	{
//		return vser.vshow();
//	}
//	@PutMapping("updateveg")
//	public VegetableModel modifyv(@RequestBody VegetableModel vs)
//	{
//		return vser.vchange(vs);
//	}
//	@DeleteMapping("deleteveg/{id}")
//	public void deletevid(@PathVariable int vid )
//	{
//		vser.vdelete(vid);
//	}
//	@DeleteMapping("delveg")
//	public void delvid(@RequestParam int vid)
//	{
//		vser.vdelete(vid);
//	}
//	@GetMapping("Sort/{name}")
//	   public List<VegetableModel> getsortinfo(@PathVariable String name)
//	   {
//		  return  vser.sortveg(name);
//	   }
//	   @GetMapping("{pageno}/{pagesize}")
//	   public List<VegetableModel> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
//	   {
//		   return vser.getbypageveg(pageno,pagesize);
//	   }
//	
//	   @GetMapping("/veg/{pageNo}/{pageSize}/{sortBy}")
//	   public List<VegetableModel> getStudents(
//	           @PathVariable int pageNo, @PathVariable int pageSize, @PathVariable String sortBy) {
//	       // Convert sortDir to Sort.Direction
//	       if (sortBy != null && !sortBy.isEmpty()) {
//	           // Sorting is requested, apply sorting
//	           return vser.getSortedAndPagedDataveg(pageNo, pageSize, sortBy);
//	       } else {
//	           // No sorting is requested, apply pagination only
//	           return vser.getbypageveg(pageNo, pageSize);
//	           
//	       }
//	   }
//@GetMapping("/getvname/{vname}")
//public List<VegetableModel> displayname(@PathVariable String fname)
//{
//	 return vser.getvn(fname);
//}
//@GetMapping("/getvprice/{vprice}")
//public List<VegetableModel> displayprice(@PathVariable long fprice)
//{
//	 return vser.getvp(fprice);
//}
//@GetMapping("/getvname/{vname}/getvprice/{vprice}")
//public List<VegetableModel> displaynameprice(@PathVariable String fname,@PathVariable long fprice)
//{
//	 return vser.getvnp(fname,fprice);
//}
//
//
//
//}