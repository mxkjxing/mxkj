package cn.fjmx.vo;

import java.util.List;

import cn.fjmx.entity.ModuleLabelBody1;
import cn.fjmx.entity.ModuleLabelBody2;
import cn.fjmx.entity.ModuleLabelBody3;

public class LabelAndBodyVO {
	private Integer module_label_id;
	private Integer module_id;
	private String module_label_name;
	private String module_label_link;
	private Integer is_default;
	private List<ModuleLabelBody1> module_label_body1;
	private List<ModuleLabelBody2> module_label_body2;
	private List<ModuleLabelBody3> module_label_body3;
	public Integer getModule_label_id() {
		return module_label_id;
	}
	public void setModule_label_id(Integer module_label_id) {
		this.module_label_id = module_label_id;
	}
	public Integer getModule_id() {
		return module_id;
	}
	public void setModule_id(Integer module_id) {
		this.module_id = module_id;
	}
	public String getModule_label_name() {
		return module_label_name;
	}
	public void setModule_label_name(String module_label_name) {
		this.module_label_name = module_label_name;
	}
	public String getModule_label_link() {
		return module_label_link;
	}
	public void setModule_label_link(String module_label_link) {
		this.module_label_link = module_label_link;
	}
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}
	public List<ModuleLabelBody1> getModule_label_body1() {
		return module_label_body1;
	}
	public void setModule_label_body1(List<ModuleLabelBody1> module_label_body1) {
		this.module_label_body1 = module_label_body1;
	}
	public List<ModuleLabelBody2> getModule_label_body2() {
		return module_label_body2;
	}
	public void setModule_label_body2(List<ModuleLabelBody2> module_label_body2) {
		this.module_label_body2 = module_label_body2;
	}
	public List<ModuleLabelBody3> getModule_label_body3() {
		return module_label_body3;
	}
	public void setModule_label_body3(List<ModuleLabelBody3> module_label_body3) {
		this.module_label_body3 = module_label_body3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((module_label_id == null) ? 0 : module_label_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LabelAndBodyVO other = (LabelAndBodyVO) obj;
		if (module_label_id == null) {
			if (other.module_label_id != null)
				return false;
		} else if (!module_label_id.equals(other.module_label_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LabelAndBodyVO [module_label_id=" + module_label_id + ", module_id=" + module_id
				+ ", module_label_name=" + module_label_name + ", module_label_link=" + module_label_link
				+ ", is_default=" + is_default + ", module_label_body1=" + module_label_body1 + ", module_label_body2="
				+ module_label_body2 + ", module_label_body3=" + module_label_body3 + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
