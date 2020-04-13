package cn.fjmx.vo;

import java.util.List;

import cn.fjmx.entity.LabelSubhead;

public class LabelVO {
	private Integer label_id;
	private Integer title_id;
	private String label_name;
	private String label_avatar;
	private String label_link;
	private List<LabelSubhead> labelSubhead;
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
	public String getLabel_link() {
		return label_link;
	}
	public void setLabel_link(String label_link) {
		this.label_link = label_link;
	}
	public List<LabelSubhead> getLabelSubhead() {
		return labelSubhead;
	}
	public void setLabelSubhead(List<LabelSubhead> labelSubhead) {
		this.labelSubhead = labelSubhead;
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
		LabelVO other = (LabelVO) obj;
		if (label_id == null) {
			if (other.label_id != null)
				return false;
		} else if (!label_id.equals(other.label_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LabelVO [label_id=" + label_id + ", title_id=" + title_id + ", label_name=" + label_name
				+ ", label_avatar=" + label_avatar + ", label_link=" + label_link + ", labelSubhead=" + labelSubhead
				+ ", toString()=" + super.toString() + "]";
	}
	
}
