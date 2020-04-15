package cn.fjmx.entity;

public class ModuleLabelBody1 extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2334160883496668L;
	private Integer module_label_body_1_id;
	private Integer module_label_id;
	private String module_label_body_1_name;
	private String module_label_body_1_avatar;
	private String module_label_body_1_link;
	private String module_label_body_1_discribe_line1;
	private String module_label_body_1_discribe_line2;
	private String module_label_body_1_discribe_line3;
	private String module_label_body_1_discribe_line4;
	public Integer getModule_label_body_1_id() {
		return module_label_body_1_id;
	}
	public void setModule_label_body_1_id(Integer module_label_body_1_id) {
		this.module_label_body_1_id = module_label_body_1_id;
	}
	public Integer getModule_label_id() {
		return module_label_id;
	}
	public void setModule_label_id(Integer module_label_id) {
		this.module_label_id = module_label_id;
	}
	public String getModule_label_body_1_name() {
		return module_label_body_1_name;
	}
	public void setModule_label_body_1_name(String module_label_body_1_name) {
		this.module_label_body_1_name = module_label_body_1_name;
	}
	public String getModule_label_body_1_avatar() {
		return module_label_body_1_avatar;
	}
	public void setModule_label_body_1_avatar(String module_label_body_1_avatar) {
		this.module_label_body_1_avatar = module_label_body_1_avatar;
	}
	public String getModule_label_body_1_link() {
		return module_label_body_1_link;
	}
	public void setModule_label_body_1_link(String module_label_body_1_link) {
		this.module_label_body_1_link = module_label_body_1_link;
	}
	public String getModule_label_body_1_discribe_line1() {
		return module_label_body_1_discribe_line1;
	}
	public void setModule_label_body_1_discribe_line1(String module_label_body_1_discribe_line1) {
		this.module_label_body_1_discribe_line1 = module_label_body_1_discribe_line1;
	}
	public String getModule_label_body_1_discribe_line2() {
		return module_label_body_1_discribe_line2;
	}
	public void setModule_label_body_1_discribe_line2(String module_label_body_1_discribe_line2) {
		this.module_label_body_1_discribe_line2 = module_label_body_1_discribe_line2;
	}
	public String getModule_label_body_1_discribe_line3() {
		return module_label_body_1_discribe_line3;
	}
	public void setModule_label_body_1_discribe_line3(String module_label_body_1_discribe_line3) {
		this.module_label_body_1_discribe_line3 = module_label_body_1_discribe_line3;
	}
	public String getModule_label_body_1_discribe_line4() {
		return module_label_body_1_discribe_line4;
	}
	public void setModule_label_body_1_discribe_line4(String module_label_body_1_discribe_line4) {
		this.module_label_body_1_discribe_line4 = module_label_body_1_discribe_line4;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((module_label_body_1_id == null) ? 0 : module_label_body_1_id.hashCode());
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
		ModuleLabelBody1 other = (ModuleLabelBody1) obj;
		if (module_label_body_1_id == null) {
			if (other.module_label_body_1_id != null)
				return false;
		} else if (!module_label_body_1_id.equals(other.module_label_body_1_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ModuleLabelBody1 [module_label_body_1_id=" + module_label_body_1_id + ", module_label_id="
				+ module_label_id + ", module_label_body_1_name=" + module_label_body_1_name
				+ ", module_label_body_1_avatar=" + module_label_body_1_avatar + ", module_label_body_1_link="
				+ module_label_body_1_link + ", module_label_body_1_discribe_line1="
				+ module_label_body_1_discribe_line1 + ", module_label_body_1_discribe_line2="
				+ module_label_body_1_discribe_line2 + ", module_label_body_1_discribe_line3="
				+ module_label_body_1_discribe_line3 + ", module_label_body_1_discribe_line4="
				+ module_label_body_1_discribe_line4 + "]";
	}
	
	
}
