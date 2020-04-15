package cn.fjmx.entity;

public class ModuleLabelBody2 extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5572035205600263953L;
	private Integer module_label_body_2_id;
	private Integer module_label_id;
	private String module_label_body_2_name;
	private String module_label_body_2_avatar;
	private String module_label_body_2_link;
	public Integer getModule_label_body_2_id() {
		return module_label_body_2_id;
	}
	public void setModule_label_body_2_id(Integer module_label_body_2_id) {
		this.module_label_body_2_id = module_label_body_2_id;
	}
	public Integer getModule_label_id() {
		return module_label_id;
	}
	public void setModule_label_id(Integer module_label_id) {
		this.module_label_id = module_label_id;
	}
	public String getModule_label_body_2_name() {
		return module_label_body_2_name;
	}
	public void setModule_label_body_2_name(String module_label_body_2_name) {
		this.module_label_body_2_name = module_label_body_2_name;
	}
	public String getModule_label_body_2_avatar() {
		return module_label_body_2_avatar;
	}
	public void setModule_label_body_2_avatar(String module_label_body_2_avatar) {
		this.module_label_body_2_avatar = module_label_body_2_avatar;
	}
	public String getModule_label_body_2_link() {
		return module_label_body_2_link;
	}
	public void setModule_label_body_2_link(String module_label_body_2_link) {
		this.module_label_body_2_link = module_label_body_2_link;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((module_label_body_2_id == null) ? 0 : module_label_body_2_id.hashCode());
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
		ModuleLabelBody2 other = (ModuleLabelBody2) obj;
		if (module_label_body_2_id == null) {
			if (other.module_label_body_2_id != null)
				return false;
		} else if (!module_label_body_2_id.equals(other.module_label_body_2_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ModuleLabelBody2 [module_label_body_2_id=" + module_label_body_2_id + ", module_label_id="
				+ module_label_id + ", module_label_body_2_name=" + module_label_body_2_name
				+ ", module_label_body_2_avatar=" + module_label_body_2_avatar + ", module_label_body_2_link="
				+ module_label_body_2_link + "]";
	}
	
}
