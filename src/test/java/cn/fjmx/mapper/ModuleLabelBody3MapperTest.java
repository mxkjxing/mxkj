package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.ModuleLabelBody3;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleLabelBody3MapperTest {
	@Autowired
	private ModuleLabelBody3Mapper mapper;
	@Test
	public void findByLabelId() {
		Integer label_id = 1;
		List<ModuleLabelBody3> moduleLabelBody3s = mapper.findByLabelId(label_id);
		
		for(ModuleLabelBody3 ModuleLabelBody3:moduleLabelBody3s) {
			System.out.println(ModuleLabelBody3.toString()); 
		}
	}
}
