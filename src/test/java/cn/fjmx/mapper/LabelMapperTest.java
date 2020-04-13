package cn.fjmx.mapper;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.Label;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LabelMapperTest {
	@Autowired
	private LabelMapper mapper;
	@Test
	public void findAll() {
		List<Label> labels = mapper.findAll();
		
		for(Label label:labels) {
			System.out.println(label.toString()); 
		}
	}
}
