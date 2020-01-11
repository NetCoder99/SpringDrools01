package com.home.SpringDrools01.runners;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.home.SpringDrools01.entities.sqlserver.ContactType;
import com.home.SpringDrools01.repositories.sqlserver.ContactTypeRepository;

@Component
@Order(1)
public class DepartmentRunner  implements ApplicationRunner{

	@Autowired
	private ContactTypeRepository contactTypeRepository;

	int factsFired = 0;

	public void run(ApplicationArguments arg0) throws Exception {
		try {
			System.out.println("------ DepartmentRunner Started ------");

			List<FactHandle> factsList = new ArrayList<FactHandle>();
			
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			List<ContactType> tmpList = (List<ContactType>) contactTypeRepository.findAll();
			tmpList.forEach(rec -> {
				//System.out.println(rec.toString());
				factsList.add(kSession.insert(rec));
				factsFired = kSession.fireAllRules();
			});

			System.out.println("------ DepartmentRunner Finsihed ------");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("------ DepartmentRunner Failed ------");
		}

	}
}
