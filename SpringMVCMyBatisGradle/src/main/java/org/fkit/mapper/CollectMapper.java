package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Cart;
import org.fkit.domain.Collect;

public interface CollectMapper {
	//删除商品
    @Delete("delete from collection where good_id=#{good_id}")
	void removeCollect(Collect collect);
    
    //从收藏夹通过ID找物品
    @Select("select * from collection")
	List<Collect> findAll();
    //通过ID寻找书
    @Select("select * from collection where good_id=#{good_id}")
	Collect findWithId(@Param("good_id") int good_id);
   //进行收藏
    @Insert("insert into collection(good_id,name,price,detail,image,goodtype,user_id) values(#{good_id},#{name},#{price},#{detail},#{image},#{goodtype},#{user_id})")
	void saveCollect(@Param("good_id") int good_id,@Param("price")String price,@Param("name")String name,@Param("detail")String detail,@Param("image")String image,@Param("goodtype")String goodtype,@Param("user_id")int user_id);

    //清空收藏
    @Delete("delete from collection ")
	void clearCollect();
    //
	//删除商品
	@Delete("delete from collection where good_id=#{good_id}")
	void removeCart(Cart cart);
}
