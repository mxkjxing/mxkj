package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.Module;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ModuleMapperTest {
	@Autowired
	ModuleMapper mapper;
	@Test
	public void findAll() {
		List<Module> modules = mapper.findAll();
		for(Module module:modules) {
			System.err.println(module.toString());
		}
	}
}
