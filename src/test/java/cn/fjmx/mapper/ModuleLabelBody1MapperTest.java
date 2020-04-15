package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.Label;
import cn.fjmx.entity.ModuleLabelBody1;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleLabelBody1MapperTest {
	@Autowired
	private ModuleLabelBody1Mapper mapper;
	@Test
	public void findByLabelId() {
		Integer label_id = 1;
		List<ModuleLabelBody1> moduleLabelBody1s = mapper.findByLabelId(label_id);
		
		for(ModuleLabelBody1 ModuleLabelBody1:moduleLabelBody1s) {
			System.out.println(ModuleLabelBody1.toString()); 
		}
	}
}
