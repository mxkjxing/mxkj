package cn.fjmx.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.vo.LabelVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabelServiceTest{
	
	@Autowired
	private ILabelService service;
	
	@Test
	public void findPagehomeLabel() {
		Integer title_id = 1;
		List<LabelVO> labelVOs = service.findPagehomeLabel(title_id);
		for(LabelVO labelVO:labelVOs) {
			System.out.println(labelVO.toString());
		}
		
	}
}
