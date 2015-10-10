package com.whiteledger.domain.cms;
public class DataView {
	
	public enum ViewEnum {
		Basic,
		Summary,
		SummaryWithAudit,
		FullWithoutAudit,
		Full,
		ExpandAll
	}
	
	static public Class<?> getViewClass(String viewName) {
		
		switch (ViewEnum.valueOf(viewName)) {
		case Basic:
			return Basic.class;
		case Summary:
			return Summary.class;
		case SummaryWithAudit:
			return SummaryWithAudit.class;
		case FullWithoutAudit:
			return FullWithoutAudit.class;
		case Full:
			return Full.class;
		case ExpandAll:
			return ExpandAll.class;
		}
		
		return null;
	}
	
	// return ID and name
	public interface Basic {}
	
	// return ID, name, description and other important fields
	public interface Summary  extends Basic {}
	
	// return ID, name, description, Audit fields (create, update date and user) 
	// and other important fields
	public interface SummaryWithAudit extends Summary {}
	
	// return all record data except the Audit fields
	public interface FullWithoutAudit extends Summary {}
	
	// return ALL entity’s fields, excluding compound fields (object fields)
	public interface Full extends FullWithoutAudit {} 
	
	//  same as ‘full’, but it also serialize ALL fields included compound object (first level depth).
	public interface ExpandAll extends Full {} 
}