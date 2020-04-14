package cn.fjmx.entity;

public class ModuleLabel extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8325205259851920814L;
	private Integer module_label_id;
	private Integer module_id;
	private String module_label_name;
	private String module_label_link;
	private Integer is_default;
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
		ModuleLabel other = (ModuleLabel) obj;
		if (module_id == null) {
			if (other.module_id != null)
				return false;
		} else if (!module_id.equals(other.module_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ModuleLabel [module_label_id=" + module_label_id + ", module_id=" + module_id + ", module_label_name="
				+ module_label_name + ", module_label_link=" + module_label_link + ", is_default=" + is_default
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
