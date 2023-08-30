//package com.example.demo.Repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.example.demo.Model.FruitModel;
//
//import jakarta.transaction.Transactional;
//
//public interface FruitRepo extends JpaRepository<FruitModel, Integer>
//{
//  @Query(value="select * from FRUITS where fname=:s ",nativeQuery =true)
//  public List <FruitModel> getfname(@Param("s") String fname);
//  
//  @Query(value="select * from FRUITS where fprice=:sn",nativeQuery =true)
//  public List <FruitModel> getfprice(@Param("sn") long fprice);
//  
//  @Query(value="select * from FRUITS where fname=:s or fprice=:sn",nativeQuery =true)
//  public List <FruitModel> getfnameprice(@Param("s") String fname,@Param("sn") long fprice);
//  
//  @Modifying
//  @Transactional
//   @Query(value="delete from FRUITS  where fname =:s", nativeQuery= true)
//   public int   delInfo(@Param("s")String fname);
//  
//  @Modifying
//  @Transactional
//  @Query(value=" update FRUITS  set fid =?1 where fid=?2", nativeQuery= true)
//  public int  updateInfo(int newid,int oldid);
//  
//}