package cn.fjmx.entity;

import java.util.Date;

public class LabelSubhead extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1711237448613161952L;
	private Integer subhead_id;
	private Integer label_id;
	private String subhead_name;
	private String subhead_link;
	private String description_label_avatar;
	private String description_label_language;
	private String createdUser;
	private Date createdTime;
	private String modifiedUser;
	private Date modifiedTime;
	public Integer getSubhead_id() {
		return subhead_id;
	}
	public void setSubhead_id(Integer subhead_id) {
		this.subhead_id = subhead_id;
	}
	public Integer getLabel_id() {
		return label_id;
	}
	public void setLabel_id(Integer label_id) {
		this.label_id = label_id;
	}
	public String getSubhead_name() {
		return subhead_name;
	}
	public void setSubhead_name(String subhead_name) {
		this.subhead_name = subhead_name;
	}
	public String getSubhead_link() {
		return subhead_link;
	}
	public void setSubhead_link(String subhead_link) {
		this.subhead_link = subhead_link;
	}
	public String getDescription_label_avatar() {
		return description_label_avatar;
	}
	public void setDescription_label_avatar(String description_label_avatar) {
		this.description_label_avatar = description_label_avatar;
	}
	public String getDescription_label_language() {
		return description_label_language;
	}
	public void setDescription_label_language(String description_label_language) {
		this.description_label_language = description_label_language;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subhead_id == null) ? 0 : subhead_id.hashCode());
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
		LabelSubhead other = (LabelSubhead) obj;
		if (subhead_id == null) {
			if (other.subhead_id != null)
				return false;
		} else if (!subhead_id.equals(other.subhead_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LabelSubhead [subhead_id=" + subhead_id + ", label_id=" + label_id + ", subhead_name=" + subhead_name
				+ ", subhead_link=" + subhead_link + ", description_label_avatar=" + description_label_avatar
				+ ", description_label_language=" + description_label_language + ", createdUser=" + createdUser
				+ ", createdTime=" + createdTime + ", modifiedUser=" + modifiedUser + ", modifiedTime=" + modifiedTime
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
