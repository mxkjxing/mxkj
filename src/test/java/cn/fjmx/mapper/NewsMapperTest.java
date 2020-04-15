package cn.fjmx.mapper;

import cn.fjmx.entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsMapperTest {

	@Autowired
	private NewsMapper mapper;

	@Test
	public void findHomepageTopTitle(){
		List<News> list = mapper.findHomepageTopTitle();
		for (News n : list){
			System.out.println(n);
		}
	}

	@Test
	public void findByUpMenuId() {
		List<News> news = mapper.findByUpMenuId(1);
		for (News ns : news) {
			System.out.println(ns);
		}
		System.out.println("------------");
	}
}
