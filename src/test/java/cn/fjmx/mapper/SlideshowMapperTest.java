package cn.fjmx.mapper;

import java.util.Date;
import java.util.List;


import cn.fjmx.entity.Slideshow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SlideshowMapperTest {

	@Autowired
	private SlideshowMapper mapper;

	@Test
	public void findAll() {
		List<Slideshow> list = mapper.findAll();
		for (Slideshow ss: list) {
			System.out.println(ss);
		}
	}

	@Test
	public void insert(){
		Slideshow slideshow = new Slideshow();
		slideshow.setUrl("http://www.fanwe.com/wx_live");
		slideshow.setImgSrc("http://www.fanwe.com/app/Tpl/new/coupon/images//wx_live/banner.jpg");
		String username = "轮播管理员";
		Date now = new Date();
		slideshow.setCreatedUser(username);
		slideshow.setCreatedTime(now);
		slideshow.setModifiedUser(username);
		slideshow.setModifiedTime(now);
		Integer rows = mapper.insert(slideshow);
		System.out.println(rows);
	}

}
