package cn.fjmx.entity;

import java.util.Date;

/**
 * 
 *
 */
public class Label extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7593166851097963230L;
	private Integer label_id;
	private Integer title_id;
	private String label_name;
	private String label_avatar;
	private String label_link;
	private String createdUser;
	private Date createTime;
	private String modifiedUser;
	private Date modifiedTime;
	
	public Integer getLabel_id() {
		return label_id;
	}
	public void setLabel_id(Integer label_id) {
		this.label_id = label_id;
	}
	public Integer getTitle_id() {
		return title_id;
	}
	public void setTitle_id(Integer title_id) {
		this.title_id = title_id;
	}
	public String getLabel_name() {
		return label_name;
	}
	public void setLabel_name(String label_name) {
		this.label_name = label_name;
	}
	public String getLabel_avatar() {
		return label_avatar;
	}
	public void setLabel_avatar(String label_avatar) {
		this.label_avatar = label_avatar;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getLabel_link() {
		return label_link;
	}
	public void setLabel_link(String label_link) {
		this.label_link = label_link;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label_id == null) ? 0 : label_id.hashCode());
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
		Label other = (Label) obj;
		if (label_id == null) {
			if (other.label_id != null)
				return false;
		} else if (!label_id.equals(other.label_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Label [label_id=" + label_id + ", title_id=" + title_id + ", label_name=" + label_name
				+ ", label_avatar=" + label_avatar + ", label_link=" + label_link + ", createdUser=" + createdUser
				+ ", createTime=" + createTime + ", modifiedUser=" + modifiedUser + ", modifiedTime=" + modifiedTime
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
