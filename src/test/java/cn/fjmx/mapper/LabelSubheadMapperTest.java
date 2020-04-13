package cn.fjmx.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fjmx.entity.LabelSubhead;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LabelSubheadMapperTest {
	
	@Autowired
	private LabelSubheadMapper mapper;
	
	@Test
	public void findByLabelId() {
		Integer label_id = 1;
		List<LabelSubhead> subheads = mapper.findByLabelId(label_id);
		for(LabelSubhead subhead:subheads) {
			System.err.println(subhead.toString());
		}
	}
}
