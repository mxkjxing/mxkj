package cn.fjmx.entity;

public class ModuleLabelBody3 extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1250948811275659374L;
	private Integer module_label_body_3_id;
	private Integer module_label_id;
	private String module_label_body_3_discribe;
	private String module_label_body_3_title;
	private String module_label_body_3_avatar;
	private String module_label_body_3_link;
	public Integer getModule_label_body_3_id() {
		return module_label_body_3_id;
	}
	public void setModule_label_body_3_id(Integer module_label_body_3_id) {
		this.module_label_body_3_id = module_label_body_3_id;
	}
	public Integer getModule_label_id() {
		return module_label_id;
	}
	public void setModule_label_id(Integer module_label_id) {
		this.module_label_id = module_label_id;
	}
	public String getModule_label_body_3_discribe() {
		return module_label_body_3_discribe;
	}
	public void setModule_label_body_3_discribe(String module_label_body_3_discribe) {
		this.module_label_body_3_discribe = module_label_body_3_discribe;
	}
	public String getModule_label_body_3_title() {
		return module_label_body_3_title;
	}
	public void setModule_label_body_3_title(String module_label_body_3_title) {
		this.module_label_body_3_title = module_label_body_3_title;
	}
	public String getModule_label_body_3_avatar() {
		return module_label_body_3_avatar;
	}
	public void setModule_label_body_3_avatar(String module_label_body_3_avatar) {
		this.module_label_body_3_avatar = module_label_body_3_avatar;
	}
	public String getModule_label_body_3_link() {
		return module_label_body_3_link;
	}
	public void setModule_label_body_3_link(String module_label_body_3_link) {
		this.module_label_body_3_link = module_label_body_3_link;
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
		ModuleLabelBody3 other = (ModuleLabelBody3) obj;
		if (module_label_id == null) {
			if (other.module_label_id != null)
				return false;
		} else if (!module_label_id.equals(other.module_label_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ModuleLabelBody3 [module_label_body_3_id=" + module_label_body_3_id + ", module_label_id="
				+ module_label_id + ", module_label_body_3_discribe=" + module_label_body_3_discribe
				+ ", module_label_body_3_title=" + module_label_body_3_title + ", module_label_body_3_avatar="
				+ module_label_body_3_avatar + ", module_label_body_3_link=" + module_label_body_3_link
				+ ", toString()=" + super.toString() + "]";
	}
	
}
