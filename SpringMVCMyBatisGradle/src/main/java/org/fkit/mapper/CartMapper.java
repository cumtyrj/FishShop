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
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Book;
import org.fkit.domain.Cart;

public interface CartMapper {
	    
	@Select("select * from cart")
	List<Cart> findAll();

	    //加入购物车
	    @Insert("insert into cart(good_id,name,price,detail,image,goodtype) values(#{good_id},#{name},#{price},#{detail},#{image},#{goodtype})")
		void saveCart(@Param("good_id") int good_id,@Param("price")String price,@Param("name")String name,@Param("detail")String detail,@Param("image")String image,@Param("goodtype")String goodtype);
         //通过ID寻找物品
	    @Select("select * from cart where good_id=#{good_id}")
		Cart findWithId(@Param("good_id") int good_id);
        //增加数量
	    @Update("update cart set num=num+1 where good_id=#{good_id}")
		void addCart(Cart cart);
	    //清空购物车
		@Delete("delete from cart ")
		void clearCart();
	    //减少数量
		@Update("update cart set num=num-1 where good_id=#{good_id}")
		void reduceCart(Cart cart);
		//删除商品
		@Delete("delete from cart where good_id=#{good_id}")
		void removeCart(Cart cart);
}
