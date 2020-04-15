package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.ModuleLabel;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ModelLabelMapperTest {
	@Autowired
	ModuleLabelMapper mapper;
	@Test
	public void findByModuleId() {
		Integer module_id = 1;
		List<ModuleLabel> moduleLabels = mapper.findByModuleId(module_id);
		for(ModuleLabel moduleLabel:moduleLabels) {
			System.err.println(moduleLabel.toString());
		}
	}
}
