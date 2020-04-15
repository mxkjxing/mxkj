package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.ModuleLabelBody2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleLabelBody2MapperTest {
	@Autowired
	private ModuleLabelBody2Mapper mapper;
	@Test
	public void findByLabelId() {
		Integer label_id = 1;
		List<ModuleLabelBody2> moduleLabelBody2s = mapper.findByLabelId(label_id);
		
		for(ModuleLabelBody2 ModuleLabelBody2:moduleLabelBody2s) {
			System.out.println(ModuleLabelBody2.toString()); 
		}
	}
}
