package cn.fjmx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.fjmx.entity.Label;
import cn.fjmx.entity.LabelSubhead;
import cn.fjmx.mapper.LabelMapper;
import cn.fjmx.mapper.LabelSubheadMapper;
import cn.fjmx.service.ILabelService;
import cn.fjmx.vo.LabelVO;

@Service
public class LabelServiceImpl implements ILabelService{
	
	@Autowired
	private LabelMapper labelMapper;
	
	@Autowired
	private LabelSubheadMapper labelSubheadMapper;
	
	@Override
	public List<LabelVO> findPagehomeLabel(Integer title_id) {
		List<Label> labels = labelMapper.findByTitleId(title_id);
		List<LabelVO> labelVOs = new ArrayList<>();
		LabelVO labelVO = new LabelVO();
		for(Label label:labels) {
			Integer label_id = label.getLabel_id();
			List<LabelSubhead> subheads = labelSubheadMapper.findByLabelId(label_id);
		    labelVO.setLabel_id(label.getLabel_id());
		    labelVO.setLabel_avatar(label.getLabel_avatar());
		    labelVO.setLabel_link(label.getLabel_link());
		    labelVO.setLabel_name(label.getLabel_name());
		    labelVO.setTitle_id(label.getTitle_id());
		    labelVO.setLabelSubhead(subheads);
		    labelVOs.add(labelVO);
		}
		return labelVOs;
	}
	
}
