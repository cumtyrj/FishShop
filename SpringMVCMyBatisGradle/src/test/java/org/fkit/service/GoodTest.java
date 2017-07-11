package org.fkit.service;

import static org.junit.Assert.*;

import java.util.List;

import org.fkit.domain.Good;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodTest extends BaseJunitTest {
	@Autowired
	private GoodService goodService;
	@Test
	public void test1() {
		int good_id= 2;
		Good good1=goodService.selectByGoodId(good_id);
		System.out.println(good1);

		}
	@Test
	public void test2() {

		List<Good> good2=goodService.getAll();
		System.out.println(good2);
		}
}
