package com.hibernate.demos.HibernateDemo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class SubscriptionEntity {
	private static final long serialVersionID = -6790693372846798580L;
	@Id
	private Integer subscriptionId;
	private String subscriptionName;
	@ManyToMany
	@JoinTable(name = "reader_subscription_entity",joinColumns = @JoinColumn(name = "subscribe_id"))
	private Set<ReaderEntity> readers;
	public SubscriptionEntity() {
		
	}
	public SubscriptionEntity(Integer subscriptionId, String subscriptionName, Set<ReaderEntity> readers) {
		super();
		this.subscriptionId = subscriptionId;
		this.subscriptionName = subscriptionName;
		this.readers = readers;
	}
	public Integer getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	public Set<ReaderEntity> getReaders() {
		return readers;
	}
	public void setReaders(Set<ReaderEntity> readers) {
		this.readers = readers;
	}
	public static long getSerialversionid() {
		return serialVersionID;
	}
	@Override
	public String toString() {
		return "SubscriptionEntity [subscriptionId=" + subscriptionId + ", subscriptionName=" + subscriptionName
				+ ", readers=" + readers + "]";
	}
	

}
