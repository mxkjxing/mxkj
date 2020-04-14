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
	public void findByTopTitle(){
		List<News> list = mapper.findByTopTitle();
		for (News n : list){
			System.out.println(n);
		}
	}

	@Test
	public void findByUpMenuTitle(){
		List<News> list = mapper.findByTopTitle();
		for(News n : list){
			List<News> news = mapper.findByUpMenuTitle(n.getTitle());
			for (News ns : news){
				System.out.println(ns);
			}
			System.out.println("------------");
		}
	}

}
