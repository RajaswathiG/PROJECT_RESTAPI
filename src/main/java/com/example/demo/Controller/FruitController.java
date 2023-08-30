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
//import com.example.demo.Model.FruitModel;
//import com.example.demo.service.FruitService;
//
//
//@RestController
//public class FruitController {
//	@Autowired
//	FruitService fser;
//	@PostMapping("addfruit")
//	public FruitModel addf(@RequestBody FruitModel fs)
//	{
//		return fser.fadd(fs);
//	}
//	@PostMapping("manyfruit")
//	public List<FruitModel> addmanyf(@RequestBody List<FruitModel> fs)
//	{
//		return fser.fsave(fs);
//	}
//	@GetMapping("showfruit")
//	public List<FruitModel> showf()
//	{
//		return fser.fshow();
//	}
//	@PutMapping("updatefruit")
//	public FruitModel modifyf(@RequestBody FruitModel fs)
//	{
//		return fser.fchange(fs);
//	}
//	@PutMapping("updatefruit/{fid}")
//	public String modifybyid(@PathVariable int fid,@RequestBody FruitModel fs)
//	{
//		return fser.updatefinfo(fid,fs);
//	}
//	@DeleteMapping("deletefruit/{fid}")
//	public void deletefid(@PathVariable int fid )
//	{
//		fser.fdelete(fid);
//	}
//	@DeleteMapping("delfruit")
//	public void delfid(@RequestParam int fid)
//	{
//		fser.fdelete(fid);
//	}
//	@GetMapping("fruitSort/{name}")
//	   public List<FruitModel> getsortinfo(@PathVariable String name)
//	   {
//		  return  fser.sortinfo(name);
//	   }
//	   @GetMapping("/fruit/{pageno}/{pagesize}")
//	   public List<FruitModel> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
//	   {
//		   return fser.getbypage(pageno,pagesize);
//	   }
//	
//	   @GetMapping("fruit/{pageNo}/{pageSize}/{sortBy}")
//	   public List<FruitModel> getStudents(
//	           @PathVariable int pageNo, @PathVariable int pageSize, @PathVariable String sortBy) {
//	       // Convert sortDir to Sort.Direction
//	       if (sortBy != null && !sortBy.isEmpty()) {
//	           // Sorting is requested, apply sorting
//	           return fser.getSortedAndPagedData(pageNo, pageSize, sortBy);
//	       } else {
//	           // No sorting is requested, apply pagination only
//	           return fser.getbypage(pageNo, pageSize);
//	           
//	       }
//	   }
// @GetMapping("/getfname/{fname}")
// public List<FruitModel> displayname(@PathVariable String fname)
// {
//	 return fser.getfn(fname);
// }
// @GetMapping("/getfprice/{fprice}")
// public List<FruitModel> displayprice(@PathVariable long fprice)
// {
//	 return fser.getfp(fprice);
// }
// @GetMapping("/getfname/{fname}/getfprice/{fprice}")
// public List<FruitModel> displaynameprice(@PathVariable String fname,@PathVariable long fprice)
// {
//	 return fser.getfnp(fname,fprice);
// }
//
// @PutMapping("/update/{id}/{id1}")
// public String updateInfo(@PathVariable int id,@PathVariable int id1)
// {
//	   return fser.updatedetails(id,id1)+" updated";
// }
// @DeleteMapping("/delete/{fname}")
// public String del(@PathVariable String fname)
// {
//	   return fser.delDetails(fname)+" deleted";
// }
//}