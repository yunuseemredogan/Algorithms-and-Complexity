package com.mycompany.yunus_emre_dogan_hw2;

/**
 *
 * @author ynsmr
 */
public class Device {
    private String name;
	 private String type;
	 private String value;
	 private Integer count;
	 public Device next; // Pointer to the next node in the linked list
	 
	 public Device(String n, String t, String v, Integer c) {
		 this.name = n;
		 this.type = t;
		 this.value = v;
		 this.count = c;
		 this.next = null; // Initialize the next pointer to null
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
