package net.emecas.udeploy;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExperimentalClientTest {

	static String app_id  = "168c9eb7-ce19-9514-0f38-e511989afddb";
	
	//https://www.ibm.com/support/knowledgecenter/SS4GSP_6.2.6/com.ibm.udeploy.api.doc/topics/rest_cli_application_info_get.html	
	
	@Test
	public void testGetApplicationInfo() {
/*		
		{  "id":"168c9eb7-ce19-9514-0f38-e511989afddb",
		   "securityResourceId":"168c9eb7-cd9e-ba8d-2c15-41d3d22e0003",
		   "name":"Mobile-APIs",
		   "description":"",
		   "created":1549575879424,
		   "enforceCompleteSnapshots":false,
		   "active":true,
		   "tags":[
		            { "id":"05db0df7-ab41-44b2-bffb-e34f612c3b6f",
		              "name":"Mobile",
		              "color":"#838329",
		              "description":"",
		              "objectType":"Application"}
		           ],
		   "deleted":false,
		   "user":"Tasker, Alex (Systems Verification & Testing) (atasker2)",
		   "componentCount":13,
		   "extendedSecurity":{ "read":true,
			                    "Create Applications":true,
			                    "Create Applications From Template":true,
			                    "Delete":true,
			                    "Edit Basic Settings":true,
			                    "Manage Blueprints":true,
			                    "Manage Components":true,
			                    "Manage Environments":true,
			                    "Manage Processes":true,
			                    "Manage Properties":true,
			                    "Manage Snapshots":true,
			                    "Manage Teams":true,
			                    "Run Component Processes":true,
			                    "View Applications":true,
			                    "teams":[  {"teamId":"7541de71-bd7a-4115-9c57-e55543a89948",
			                    	        "teamLabel":"IT Development",
			                    	        "resourceTypeId":"20000000000000000000000000000100",
			                    	        "resourceTypeName":"Application"}
			                    ]
		    },
		   "propSheet":{  "id":"168c9eb7-ce3c-4c03-3af8-bec7f1252050",
		    	          "path":"applications\/168c9eb7-ce19-9514-0f38-e511989afddb\/propSheet",
		    	          "version":1,
		    	          "versionCount":1,
		    	          "commit":207192,
		    	          "versioned":true},
		   "templatePropSheet":{  "id":"168c9eb7-ce4a-24e9-08f5-5464c8c7c383",
		    	        	      "name":"template",
		    	        	      "path":"applications\/168c9eb7-ce19-9514-0f38-e511989afddb\/templatePropSheet",
		    	        	      "version":1,
		    	        	      "versionCount":1,
		    	        	      "commit":207192,
		    	        	      "versioned":true},
		   "properties":[]
		}
*/
		
		
		String expected = "\"id\":\"168c9eb7-ce19-9514-0f38-e511989afddb\"";
		String url = String.format(ExperimentalClient.APP_INFO, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}
	
	//https://www.ibm.com/support/knowledgecenter/SS4GSP_6.2.6/com.ibm.udeploy.api.doc/topics/rest_cli_application_componentsinapplication_get.html
	
	@Test
	public void testGetApplicationComponentsInfo() {
/*		[
		 {	"id":"1642794c-dff1-eca7-dba1-36712adffebe",
			"securityResourceId":"1642794c-ded1-ada1-ee76-22f9ee548846",  // reurce16427971-36ce-18d9-31a6-b3373052b904
			"name":"JAR-Embedded-DegreeInfo-API",
			"description":"",
			"created":1529672420557,
			"componentType":"STANDARD",
			"ignoreQualifiers":0,
			"importAutomatically":false,
			"useVfs":true,
			"active":true,
			"integrationFailed":false,
			"deleted":false,
			"defaultVersionType":"FULL",
			"cleanupDaysToKeep":0,
			"cleanupCountToKeep":0,
			"templateVersion":-1,
			"tags":[],
			"templateTags":[],
			"user":"Grim, Jonathan Michael (Systems Verification & Testing) (jmgrim)"},
		 {  "id":"164a446e-8a43-50b4-e4a1-680cb9684f50",
			"securityResourceId":"164a446e-89cd-b078-1a53-46080c3e0840",
			"name":"Jar-Embedded-is-gpadcp-api-app",
			"description":"Mobile",
			"created":1531764467522,
			"componentType":"STANDARD",
			"ignoreQualifiers":0,
			"importAutomatically":false,
			"useVfs":true,
			"active":true,
			"integrationFailed":false,
			"deleted":false,
			"defaultVersionType":"FULL",
			"cleanupDaysToKeep":0,
			"cleanupCountToKeep":0,
			"templateVersion":-1,
			"tags":[],
			"templateTags":[],
			"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},
		 {  "id":"9a34f246-45dc-49e8-b4e6-0917e68115f5",
			"securityResourceId":"0701b5ac-0b98-47ab-865d-a146ee8b9b05",
			"name":"JAR-embedded-mobileapi",
			"description":"",
			"created":1487692255948,
			"componentType":"STANDARD",
			"ignoreQualifiers":0,
			"importAutomatically":false,
			"useVfs":true,
			"active":true,
			"integrationFailed":false,
			"deleted":false,
			"defaultVersionType":"FULL",
			"cleanupDaysToKeep":0,
			"cleanupCountToKeep":0,
			"templateVersion":-1,
			"tags":[],
			"templateTags":[],
			"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},
		 {  "id":"bfeffeb7-acd7-43d2-b1cf-54020419a4f5","securityResourceId":"c6543c14-d735-4326-9286-ef9bee2fc6c1","name":"Jar-Embedded-Mobile-Bbts-Service","description":"Mobile","created":1510929753140,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},{"id":"7c88a99d-bf63-4079-ba89-d7be4b80ab05","securityResourceId":"fce592fc-5568-4d5b-ac32-a8f6bb7ab876","name":"JAR-Embedded-mobile-gateway-campuscommunity","description":"","created":1506537780874,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":true,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},{"id":"164b315e-77ee-4c23-d16f-1d82e4f1d55a","securityResourceId":"164b315e-3063-841d-caa2-f218464f3c54","name":"Jar-Embedded-mobile-lander-svc ","description":"","created":1532012914558,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},{"id":"167663b7-3b2d-52d4-10a6-57109291289c","securityResourceId":"167663b7-3a72-2197-2022-9eeb2550a847","name":"JAR-Embedded-mobile-mylu-svc","description":"","created":1543608430962,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Tasker, Alex (Systems Verification & Testing) (atasker2)"},{"id":"61e358bf-de6a-4f6f-818a-923259bcbbdf","securityResourceId":"53a92d2e-31c8-438b-beaf-112a735ad53b","name":"Jar-Embedded-mobile-predictive-svc","description":"Mobile","created":1511366134805,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"},{"id":"162e4177-f208-8c81-e488-a96bbf2b06f2","securityResourceId":"162e4177-f0ef-64cf-3603-96636517e602","name":"JAR-Embedded-PopselAPI","description":"PopselAPI","created":1524245167600,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Grim, Jonathan Michael (Systems Verification & Testing) (jmgrim)"},{"id":"99502634-c906-4a50-9c90-0d6ca2ff2709","securityResourceId":"04144eeb-95c7-43b8-98eb-33e50ef74326","name":"JAR-embedded-sport-feeds","description":"","created":1493825111369,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":true,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Welch, Jeffrey L (Systems Verification & Testing) (jlwelch2)"},{"id":"163fe766-8692-bb3b-a97b-265b1d9aa607","securityResourceId":"163fe766-8567-8ea1-751d-53bf1cbd2f59","name":"SQL-Banner-DEGREEINFO-API","description":"IS-DEGREEINFO-API ","created":1528982562542,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Grim, Jonathan Michael (Systems Verification & Testing) (jmgrim)"},{"id":"16326c17-4039-f70a-f5e0-39f2ae38cac2","securityResourceId":"16326c16-f118-efdb-7dd4-4789c960bcd8","name":"SQL-Banner-IS-popsel-api","description":"SOCAPI","created":1525363602434,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":true,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Welch, Jeffrey L (Systems Verification & Testing) (jlwelch2)"},{"id":"1643850a-3d4a-9a23-c197-c8c024672916","securityResourceId":"1643850a-3cc5-bb2f-68e6-ac7045d718e1","name":"SQL-WHDB-Predictive-Feedback-Svc","description":"Mobile","created":1529953165950,"componentType":"STANDARD","ignoreQualifiers":0,"importAutomatically":false,"useVfs":true,"active":true,"integrationFailed":false,"deleted":false,"defaultVersionType":"FULL","cleanupDaysToKeep":0,"cleanupCountToKeep":0,"templateVersion":-1,"tags":[],"templateTags":[],"user":"Pearson, Micah (Systems Verification & Testing) (mpearson23)"}]
		
*/		
		String expected = "\"id\":\"1642794c-dff1-eca7-dba1-36712adffebe\"";
		String url = String.format(ExperimentalClient.APP_COMPONENTS_INFO, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}


	@Test
	public void testGetApplicationBlueprintsIn() {
		String expected = "[]";
		String url = String.format(ExperimentalClient.APP_BLUEPRINTS_IN, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}

	
	@Test
	public void testGetApplicationProperties() {
		//String expected = "[]";
		String expected1 = "\"id\":\"168e25f7-4a7d-76f7-f487-089d23338037\"";
		String expected2 = "\"name\":\"property1\"";
		String expected3 = "\"value\":\"value1\"";
		String url = String.format(ExperimentalClient.APP_PROPERTIES, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected1));
		assertTrue(actual.contains(expected2));
		assertTrue(actual.contains(expected3));
	}
	
	
	@Test
	public void testGetApplicationEnvironments() {
/*		[
		 
		 {	 "id":"168c9ec3-f374-b377-7258-63bed7628692",
			 "securityResourceId":"168c9ec3-f158-5483-70be-5459adc74dcb",
			 "name":"Development",
			 "description":"",
			 "color":"#17AF4B",
			 "requireApprovals":false,
			 "noSelfApprovals":false,
			 "lockSnapshots":false,
			 "calendarId":"168c9ec3-f388-dc5f-bcd1-ada44fd3adb4",
			 "active":true,
			 "deleted":false,
			 "snapshotDaysToKeep":0,
			 "cleanupDaysToKeep":0,
			 "cleanupCountToKeep":0,
			 "enableProcessHistoryCleanup":true,
			 "useSystemDefaultDays":true,
			 "historyCleanupDaysToKeep":365,
			 "requireSnapshot":false,
			 "conditions":[]
		 }
		]*/

		
		String expected1 = "\"id\":\"168c9ec3-f374-b377-7258-63bed7628692\"";
		String expected2 = "\"name\":\"Development\"";
		String url = String.format(ExperimentalClient.APP_ENVIRONMENTS_IN, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected1));
		assertTrue(actual.contains(expected2));
	}
	
	
	
	@Test
	public void testGetApplicationProcess() {
		//[{"id":"168cdf79-a665-8765-b563-860aa0fc0994","name":"Deploy","description":"","active":true,"inventoryManagementType":"AUTOMATIC","offlineAgentHandling":"PRE_EXECUTION_CHECK","versionCount":2,"version":2,"commit":207276,"path":"applications\/168c9eb7-ce19-9514-0f38-e511989afddb\/processes\/168cdf79-a665-8765-b563-860aa0fc0994","deleted":false,"metadataType":"applicationProcess","application":{"id":"168c9eb7-ce19-9514-0f38-e511989afddb","securityResourceId":"168c9eb7-cd9e-ba8d-2c15-41d3d22e0003","name":"Mobile-APIs","description":"","created":1549575879424,"enforceCompleteSnapshots":false,"active":true,"tags":[{"id":"05db0df7-ab41-44b2-bffb-e34f612c3b6f","name":"Mobile","color":"#838329","description":"","objectType":"Application"}],"deleted":false,"user":"Tasker, Alex (Systems Verification & Testing) (atasker2)","security":{"read":true,"Create Applications":true,"Create Applications From Template":true,"Delete":true,"Edit Basic Settings":true,"Manage Blueprints":true,"Manage Components":true,"Manage Environments":true,"Manage Processes":true,"Manage Properties":true,"Manage Snapshots":true,"Manage Teams":true,"Run Component Processes":true,"View Applications":true}}}]
		String expected1 = "\"id\":\"168cdf79-a665-8765-b563-860aa0fc0994\"";
		String expected2 = "\"name\":\"Deploy\"";
		String url = String.format(ExperimentalClient.APP_PROCESS, app_id);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected1));
		assertTrue(actual.contains(expected2));
	}
	
	
	@Test
	public void testGetApplicationProcessRequiredProperties() {
		String processName = "Deploy";
		//String expected1 = "\"id\":\"168cdf79-a665-8765-b563-860aa0fc0994\"";
		//String expected2 = "\"name\":\"Deploy\"";
		String expected = "[]";
		String url = String.format(ExperimentalClient.APP_PROCESS_REQUIRED_PROPERTIES, app_id, processName);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
		//assertTrue(actual.contains(expected1));
		//assertTrue(actual.contains(expected2));
	}
	
	
	@Test   //WHY THIS IS GETTING A 204 ???  
	public void testGetApplicationProcessInfo() {
		String processName = "Deploy";
		//String expected1 = "\"id\":\"168cdf79-a665-8765-b563-860aa0fc0994\"";
		//String expected2 = "\"name\":\"Deploy\"";
		String expected = "[]";
		String url = String.format(ExperimentalClient.APP_PROCESS_INFO, app_id, processName);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
		//assertTrue(actual.contains(expected1));
		//assertTrue(actual.contains(expected2));
	}
	
	
	
	
	@Test
	public void testGetEnvironmentInfo() {
		//String environment = "168c9ec3-f374-b377-7258-63bed7628692";
		String environment = "7597299a-2e70-45e9-8e6f-e0449699a69a";
		String expected = "\"id\":\"168c9ec3-f374-b377-7258-63bed7628692\"";
		String url = String.format(ExperimentalClient.ENVIRONMENT_INFO, environment);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}

	
	
	
	
	

	@Test
	public void testGetEnvironmentComponentsInfo() {
		String environment = "168c9ec3-f374-b377-7258-63bed7628692";
		//String environment = "7597299a-2e70-45e9-8e6f-e0449699a69a";
		String expected = "\"id\":\"168c9ec3-f374-b377-7258-63bed7628692\"";
		String url = String.format(ExperimentalClient.ENVIRONMENT_COMPONENTS_INFO, environment);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}
	

	@Test
	public void testGetListEnvironments() {
		String expected = "\"id\":\"168c9ec3-f374-b377-7258-63bed7628692\"";
		String url = ExperimentalClient.ENVIRONMENTS;
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
	}

	
	
	@Test //TEMPLATE
	public void testGetComponentProcessInfo() {
		String componentId= "1642794c-dff1-eca7-dba1-36712adffebe";
		String componentProcessName = "Deploy"; // de8fb657-0bb5-46b9-9cff-ad726caa532e/186

/*		{  "id":"de8fb657-0bb5-46b9-9cff-ad726caa532e",
			"name":"Deploy",
			"description":"Deploys the embedded tomcat JAR, config file, and init script.",
			"defaultWorkingDir":"${p:resource\/stage.dir}\/${p:application.name}\/${p:environment.name}\/${p:component.name}\/",
			"takesVersion":true,"inventoryActionType":"ADD","status":"Active","configActionType":"ADD",
			"active":true,"versionCount":186,"version":186,"commit":164448,"path":"componentTemplates\/3e5c33d2-fc90-404c-8c5b-e3d3cbd3ed39\/processes\/de8fb657-0bb5-46b9-9cff-ad726caa532e","deleted":false}

		*/
		String expected = "de8fb657-0bb5-46b9-9cff-ad726caa532e";
	
		
		String url = String.format(ExperimentalClient.APP_COMPONENTS_PROCESS, componentId, componentProcessName);
		String actual = ExperimentalClient.rest(url);
		System.out.println(actual);
		assertTrue(actual.contains(expected));
		//assertTrue(actual.contains(expected1));
		//assertTrue(actual.contains(expected2));
	}
	
}
