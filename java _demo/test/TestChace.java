package Test;

import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

public class TestChace {
	public static void main(String[] args) {
		Session session = HiernateUtil.getSession();
		session.createQuery("from dept").setCacheable.list();
		for (String string : args) {
			
			
		}
		
	}
}
