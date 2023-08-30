//package com.example.demo.Repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//
//import com.example.demo.Model.VegetableModel;
//
//public interface VegetableRepo extends JpaRepository<VegetableModel, Integer>{
//
//	@Query(value="select * from FRUITS where vname=:s ",nativeQuery =true)
//	  public List <VegetableModel> getvname(@Param("s") String vname);
//	  
//	  @Query(value="select * from FRUITS where vprice=:sn",nativeQuery =true)
//	  public List <VegetableModel> getvprice(@Param("sn") long vprice);
//	  
//	  @Query(value="select * from FRUITS where vname=:s or vprice=:sn",nativeQuery =true)
//	  public List <VegetableModel> getvnameprice(@Param("s") String vname,@Param("sn") long vprice);
//}