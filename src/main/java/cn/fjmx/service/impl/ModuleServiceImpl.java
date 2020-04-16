package cn.fjmx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.fjmx.entity.Module;
import cn.fjmx.entity.ModuleLabel;
import cn.fjmx.entity.ModuleLabelBody1;
import cn.fjmx.entity.ModuleLabelBody2;
import cn.fjmx.entity.ModuleLabelBody3;
import cn.fjmx.mapper.ModuleLabelBody1Mapper;
import cn.fjmx.mapper.ModuleLabelBody2Mapper;
import cn.fjmx.mapper.ModuleLabelBody3Mapper;
import cn.fjmx.mapper.ModuleLabelMapper;
import cn.fjmx.mapper.ModuleMapper;
import cn.fjmx.service.IModuleService;
import cn.fjmx.service.ex.UpdateAvatarException;
import cn.fjmx.vo.LabelAndBodyVO;
import cn.fjmx.vo.ModuleVO;

@Service
public class ModuleServiceImpl implements IModuleService{
	@Autowired
	private ModuleMapper moduleMapper;
	@Autowired
	private ModuleLabelMapper moduleLabelMapper;
	@Autowired
	private ModuleLabelBody1Mapper moduleLabelBody1Mapper;
	@Autowired
	private ModuleLabelBody2Mapper moduleLabelBody2Mapper;
	@Autowired
	private ModuleLabelBody3Mapper moduleLabelBody3Mapper;
	
	@Override
	public List<ModuleVO> modules() {
		List<ModuleVO> ModuleVOs = new ArrayList<>();
		List<LabelAndBodyVO> LabelAndBodyVOs = new ArrayList<>(); 
		ModuleVO moduleVO = new ModuleVO();
		LabelAndBodyVO labelAndBodyVO = new LabelAndBodyVO(); 
		List<Module> modules = moduleMapper.findAll(); 
		List<ModuleLabelBody1> moduleLabelBody1s;
		List<ModuleLabelBody2> moduleLabelBody2s;
		List<ModuleLabelBody3> moduleLabelBody3s;
		Integer module_id;
		Integer module_label_id;
		for(Module module:modules) {
			module_id = module.getModule_id();
			List<ModuleLabel> moduleLabels = moduleLabelMapper.findByModuleId(module_id);
			for(ModuleLabel moduleLabel:moduleLabels) {
				module_label_id = moduleLabel.getModule_label_id();
				moduleLabelBody1s = moduleLabelBody1Mapper.findByLabelId(module_label_id);
				for(ModuleLabelBody1 moduleLabelBody1:moduleLabelBody1s) {
					moduleLabelBody1.setCreatedTime(null);
					moduleLabelBody1.setCreatedUser(null);
					moduleLabelBody1.setModifiedTime(null);
					moduleLabelBody1.setModifiedUser(null);
				}
				moduleLabelBody2s = moduleLabelBody2Mapper.findByLabelId(module_label_id);
				for(ModuleLabelBody2 moduleLabelBody2:moduleLabelBody2s) {
					moduleLabelBody2.setCreatedTime(null);
					moduleLabelBody2.setCreatedUser(null);
					moduleLabelBody2.setModifiedTime(null);
					moduleLabelBody2.setModifiedUser(null);
				}
				moduleLabelBody3s = moduleLabelBody3Mapper.findByLabelId(module_label_id);
				for(ModuleLabelBody3 moduleLabelBody3:moduleLabelBody3s) {
					moduleLabelBody3.setCreatedTime(null);
					moduleLabelBody3.setCreatedUser(null);
					moduleLabelBody3.setModifiedTime(null);
					moduleLabelBody3.setModifiedUser(null);
				}
				labelAndBodyVO.setIs_default(moduleLabel.getIs_default());
				labelAndBodyVO.setModule_id(moduleLabel.getModule_id());
				labelAndBodyVO.setModule_label_body1(moduleLabelBody1s);
				labelAndBodyVO.setModule_label_body2(moduleLabelBody2s);
				labelAndBodyVO.setModule_label_body3(moduleLabelBody3s);
				labelAndBodyVO.setModule_label_id(module_label_id);
				labelAndBodyVO.setModule_label_link(moduleLabel.getModule_label_link());
				labelAndBodyVO.setModule_label_name(moduleLabel.getModule_label_name());
				LabelAndBodyVOs.add(labelAndBodyVO);
				labelAndBodyVO = new LabelAndBodyVO();
			}
			moduleVO.setLabelAndBodyVO(LabelAndBodyVOs);
			LabelAndBodyVOs = new ArrayList<>(); 
			moduleVO.setModule_avatar(module.getModule_avatar());
			moduleVO.setModule_id(module.getModule_id());
			moduleVO.setModule_link(module.getModule_link());
			moduleVO.setModule_name(module.getModule_name());
			ModuleVOs.add(moduleVO);
			moduleVO = new ModuleVO();
		}
		return ModuleVOs;
	}

	@Override
	public Integer updateAvatarMid(Integer module_id,String module_avatar) {
		Integer rows = moduleMapper.updateAvatarMid(module_id, module_avatar);
		if(rows!=1) {
			throw new UpdateAvatarException("图片数据修改异常");
		}
		
		return null;
	}
	
}
