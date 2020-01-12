//package com.home.SpringDrools01.rulepacks;
//
//import org.kie.api.KieServices;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//
//import com.home.SpringDrools01.entities.sqlserver.ContactType;
//
//
//
//public class ContactTypeRuleProcs {
//
////	public static void CheckContectRules(ContactType contactType) {
////        System.out.println( "------ CheckContectRules - Started ------" );
////
////        KieServices ks = KieServices.Factory.get();
////        KieContainer kContainer = ks.getKieClasspathContainer();
////        KieSession kSession =  kContainer.newKieSession("ksession-rules");
//// 
////        kSession.insert(contactType);
////  
////        int fired = kSession.fireAllRules();
////
////        System.out.println( "------ CheckContectRules - Finished ------" );
////		
////	}
//}
