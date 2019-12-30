package com.home.SpringDrools01;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.home.SpringDrools01.repositories.ContactTypeRepository;
import com.home.SpringDrools01.repositories.DepartmentRepository;
import com.home.SpringDrools01.rulepacks.ContactTypeRuleProcs;
import com.home.SpringDrools01.entities.ContactType;
import com.home.SpringDrools01.entities.Department;

@SpringBootApplication
public class AppMain {
	@Autowired
	private DepartmentRepository deptRepository;
	@Autowired
	private ContactTypeRepository contactTypeRepository;

	public static void main(String[] args) {
		try {
			System.out.println("------ SpringDrools01 Started ------");

			SpringApplication.run(AppMain.class, args);

			System.out.println("------ SpringDrools01 Finished ------");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("------ SpringDrools01 Failed ------");
		}

	}

	@Component
	@Order(1)
	public class DepartmentRunner implements ApplicationRunner {
		@Override
		public void run(ApplicationArguments arg0) throws Exception {
			try {
				System.out.println("------ ContactTypeRunner Started ------");

				KieServices ks = KieServices.Factory.get();
				KieContainer kContainer = ks.getKieClasspathContainer();
				KieSession kSession = kContainer.newKieSession("ksession-rules");

				List<ContactType> tmpList = (List<ContactType>) contactTypeRepository.findAll();
				tmpList.forEach(rec -> {
					System.out.println(rec.toString());
					kSession.insert(rec);
					int fired = kSession.fireAllRules();
					// ContactTypeRuleProcs.CheckContectRules(rec);
				});

				System.out.println("------ ContactTypeRunner Finsihed ------");
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("------ ContactTypeRunner Failed ------");
			}

		}
	}
}
