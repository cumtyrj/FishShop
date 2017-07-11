package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Good;
import org.fkit.domain.Order;

public interface OrderMapper {
	    
	@Select("select * from orders")
	List<Order> findAll();

	    //加入购物车
	    @Insert("insert into orders(good_id,name,price,detail,image,num,goodtype,account,loginname,ordernum,state) values(#{good_id},#{name},#{price},#{detail},#{image},#{num},#{goodtype},#{account},#{loginname},#{ordernum},#{state})")
		void saveOrder(@Param("good_id") int good_id,@Param("price")String price,@Param("name")String name,@Param("detail")String detail,@Param("image")String image,@Param("num")int num,@Param("goodtype")String goodtype,@Param("account")int account,@Param("loginname")String loginname,@Param("ordernum")String ordernum,@Param("state")String state);
         //通过ID寻找物品
	    @Select("select * from orders where good_id=#{good_id}")
	    Order findWithId(@Param("good_id") int good_id);
	    //清空购物车
		@Delete("delete from orders ")
		void clearOrder();
		//删除商品
		@Delete("delete from orders where ordernum=#{ordernum}")
		void removeOrder(Order order);
		//通过订单号查询物品
	    @Select("select * from orders where ordernum=#{ordernum}")
	    List<Order> findWithOrdernum(@Param("ordernum")String ordernum);
        //通过订单号寻找物品
	    @Select("select * from orders where ordernum=#{ordernum}")
	    Order findByOrdernum(@Param("ordernum") String ordernum);
	    //更新物流
	    @Update("update orders set state=#{state} where ordernum=#{ordernum}")
	    void updstate(Order order);
	    //查看状态
	    @Select("select * from orders where state=#{state}")
	    List<Order> findByState(@Param("state") String state);
	    //订单评分
	    @Update("update  orders set wuliu=#{wuliu},zhiliang=#{zhiliang},fuwu=#{fuwu} where ordernum=#{ordernum}")
		void commitorder(Order order);
	    //管理评价
	    @Select("select * from orders where wuliu=#{wuliu}")
	    List<Order> findByWuliu(@Param("wuliu") String wuliu);
}
