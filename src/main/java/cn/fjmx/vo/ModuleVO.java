package cn.fjmx.vo;

import java.util.List;


public class ModuleVO {
	private Integer module_id;
	private String module_name;	  
	private String module_avatar;
	private String module_link;
	private List<LabelAndBodyVO> labelAndBodyVO;
	public Integer getModule_id() {
		return module_id;
	}
	public void setModule_id(Integer module_id) {
		this.module_id = module_id;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getModule_avatar() {
		return module_avatar;
	}
	public void setModule_avatar(String module_avatar) {
		this.module_avatar = module_avatar;
	}
	public String getModule_link() {
		return module_link;
	}
	public void setModule_link(String module_link) {
		this.module_link = module_link;
	}
	public List<LabelAndBodyVO> getLabelAndBodyVO() {
		return labelAndBodyVO;
	}
	public void setLabelAndBodyVO(List<LabelAndBodyVO> labelAndBodyVO) {
		this.labelAndBodyVO = labelAndBodyVO;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((module_id == null) ? 0 : module_id.hashCode());
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
		ModuleVO other = (ModuleVO) obj;
		if (module_id == null) {
			if (other.module_id != null)
				return false;
		} else if (!module_id.equals(other.module_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ModuleVO [module_id=" + module_id + ", module_name=" + module_name + ", module_avatar=" + module_avatar
				+ ", module_link=" + module_link + ", labelAndBodyVO=" + labelAndBodyVO + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
