package com.mkanchwala.ejamaat.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@MappedSuperclass
public abstract class BaseBean implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;

    @PrePersist
    protected void prePersist() {
    	
    }	
    
    protected BaseBean() {
	
	}
    
    protected BaseBean(Long id) {
		
	}

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false, insertable=false, updatable=false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseBean that = (BaseBean) o;
        if (this.id != that.getId()) 
        	return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Long.valueOf(id).hashCode();
    }
}