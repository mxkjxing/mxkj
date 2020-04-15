package cn.fjmx.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.vo.LabelVO;
import cn.fjmx.vo.ModuleVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleServiceTest{
	
	@Autowired
	private IModuleService service;
	
	@Test
	public void findModuleVOs() {
		List<ModuleVO> ModuleVOs = service.modules();
		for(ModuleVO moduleVO:ModuleVOs) {
			System.out.println(moduleVO.toString());
		}
		
	}
}
