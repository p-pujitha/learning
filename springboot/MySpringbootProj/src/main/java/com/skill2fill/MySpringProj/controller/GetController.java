package com.skill2fill.MySpringProj.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

	@RequestMapping(value = "/getRequest/{kb}", method = RequestMethod.GET)
	public String getMethodBasedOnKb(@PathVariable("kb") int kb) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (kb == 1) {
			return "{\n" + "    \"_id\": \"64bfd4c178e6413ce2b2968a\",\n" + "    \"index\": 0,\n"
					+ "    \"guid\": \"4e70a56b-9369-4fba-b152-334cbed21f36\",\n" + "    \"isActive\": true,\n"
					+ "    \"balance\": \"$2,346.82\",\n" + "    \"picture\": \"http://placehold.it/32x32\",\n"
					+ "    \"age\": 39,\n" + "    \"eyeColor\": \"green\",\n" + "    \"name\": \"Peters Rios\",\n"
					+ "    \"gender\": \"male\",\n" + "    \"company\": \"POSHOME\",\n"
					+ "    \"email\": \"petersrios@poshome.com\",\n" + "    \"phone\": \"+1 (959) 483-2810\",\n"
					+ "    \"address\": \"278 Carroll Street, Gila, Guam, 4838\",\n"
					+ "    \"about\": \"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\n"
					+ "    \"registered\": \"2020-02-02T06:30:57 -06:-30\",\n" + "    \"latitude\": -70.492411,\n"
					+ "    \"longitude\": -117.753201,\n" + "    \"tags\": [\n" + "      \"culpa\",\n"
					+ "      \"labore\",\n" + "      \"labore\",\n" + "      \"eu\",\n" + "      \"enim\",\n"
					+ "      \"laborum\",\n" + "      \"adipisicing\"\n" + "    ],\n" + "    \"friends\": [\n"
					+ "      {\n" + "        \"id\": 0,\n" + "        \"name\": \"Kristine Donovan\"\n" + "      },\n"
					+ "      {\n" + "        \"id\": 1,\n" + "        \"name\": \"Beach Green\"\n" + "      },\n"
					+ "      {\n" + "        \"id\": 2,\n" + "        \"name\": \"Jeannine Monroe\"\n" + "      }\n"
					+ "    ],\n" + "    \"greeting\": \"Hello, Peters Rios! You have 9 unread messages.\",\n"
					+ "    \"favoriteFruit\": \"banana\"\n" + "  }";
		}
		if (kb == 3) {
			return "{\n" + "    \"_id\": \"64c06067eb582d3a11e23194\",\n" + "    \"index\": 0,\n"
					+ "    \"guid\": \"dd110304-951f-4ba9-924e-2be1816e93b8\",\n" + "    \"isActive\": true,\n"
					+ "    \"balance\": \"$3,800.03\",\n" + "    \"picture\": \"http://placehold.it/32x32\",\n"
					+ "    \"age\": 27,\n" + "    \"eyeColor\": \"green\",\n" + "    \"name\": \"Winters May\",\n"
					+ "    \"gender\": \"male\",\n" + "    \"company\": \"CENTREE\",\n"
					+ "    \"email\": \"wintersmay@centree.com\",\n" + "    \"phone\": \"+1 (831) 443-2633\",\n"
					+ "    \"address\": \"346 Suydam Place, Kohatk, South Dakota, 3000\",\n"
					+ "    \"about\": \"Deserunt sint do amet eiusmod sunt dolor nisi Lorem mollit sit aute. Laboris consectetur nulla labore ea. Consectetur dolore ipsum fugiat anim sint sit aliqua elit laboris. Aliqua proident et veniam ipsum labore eiusmod duis. Eiusmod anim eiusmod cillum pariatur non magna minim tempor irure sint et eu. Culpa mollit culpa non occaecat nulla tempor fugiat ipsum eu.\\r\\n\",\n"
					+ "    \"registered\": \"2020-07-04T05:34:21 -06:-30\",\n" + "    \"latitude\": 88.318367,\n"
					+ "    \"longitude\": -74.884011,\n" + "    \"tags\": [\n" + "      \"irure\",\n"
					+ "      \"ullamco\",\n" + "      \"elit\",\n" + "      \"reprehenderit\",\n"
					+ "      \"mollit\",\n" + "      \"cillum\",\n" + "      \"magna\"\n" + "    ],\n"
					+ "    \"friends\": [\n" + "      {\n" + "        \"id\": 0,\n"
					+ "        \"name\": \"Margret Martin\"\n" + "      },\n" + "      {\n" + "        \"id\": 1,\n"
					+ "        \"name\": \"Manuela Garza\"\n" + "      },\n" + "      {\n" + "        \"id\": 2,\n"
					+ "        \"name\": \"Sharp Robinson\"\n" + "      }\n" + "    ],\n"
					+ "    \"greeting\": \"Hello, Winters May! You have 6 unread messages.\",\n"
					+ "    \"favoriteFruit\": \"apple\",\n" + "\"_id\": \"64c06067eb582d3a11e23194\",\n"
					+ "    \"index\": 0,\n" + "    \"guid\": \"dd110304-951f-4ba9-924e-2be1816e93b8\",\n"
					+ "    \"isActive\": true,\n" + "    \"balance\": \"$3,800.03\",\n"
					+ "    \"picture\": \"http://placehold.it/32x32\",\n" + "    \"age\": 27,\n"
					+ "    \"eyeColor\": \"green\",\n" + "    \"name\": \"Winters May\",\n"
					+ "    \"gender\": \"male\",\n" + "    \"company\": \"CENTREE\",\n"
					+ "    \"email\": \"wintersmay@centree.com\",\n" + "    \"phone\": \"+1 (831) 443-2633\",\n"
					+ "    \"address\": \"346 Suydam Place, Kohatk, South Dakota, 3000\",\n"
					+ "    \"about\": \"Deserunt sint do amet eiusmod sunt dolor nisi Lorem mollit sit aute. Laboris consectetur nulla labore ea. Consectetur dolore ipsum fugiat anim sint sit aliqua elit laboris. Aliqua proident et veniam ipsum labore eiusmod duis. Eiusmod anim eiusmod cillum pariatur non magna minim tempor irure sint et eu. Culpa mollit culpa non occaecat nulla tempor fugiat ipsum eu.\\r\\n\",\n"
					+ "    \"registered\": \"2020-07-04T05:34:21 -06:-30\",\n" + "    \"latitude\": 88.318367,\n"
					+ "    \"longitude\": -74.884011,\n" + "    \"tags\": [\n" + "      \"irure\",\n"
					+ "      \"ullamco\",\n" + "      \"elit\",\n" + "      \"reprehenderit\",\n"
					+ "      \"mollit\",\n" + "      \"cillum\",\n" + "      \"magna\"\n" + "    ],\n"
					+ "    \"friends\": [\n" + "      {\n" + "        \"id\": 0,\n"
					+ "        \"name\": \"Margret Martin\"\n" + "      },\n" + "      {\n" + "        \"id\": 1,\n"
					+ "        \"name\": \"Manuela Garza\"\n" + "      },\n" + "      {\n" + "        \"id\": 2,\n"
					+ "        \"name\": \"Sharp Robinson\"\n" + "      }\n" + "    ],\n"
					+ "    \"greeting\": \"Hello, Winters May! You have 6 unread messages.\",\n"
					+ "    \"favoriteFruit\": \"apple\",\n" + " \"tags\": [\n" + "      \"irure\",\n"
					+ "      \"ullamco\",\n" + "      \"elit\",\n" + "      \"reprehenderit\",\n"
					+ "      \"mollit\",\n" + "      \"cillum\",\n" + "      \"magna\"\n" + "    ],\n"
					+ "    \"friends\": [\n" + "      {\n" + "        \"id\": 0,\n"
					+ "        \"name\": \"Margret Martin\"\n" + "      },\n" + "      {\n" + "        \"id\": 1,\n"
					+ "        \"name\": \"Manuela Garza\"\n" + "      },\n" + "      {\n" + "        \"id\": 2,\n"
					+ "        \"name\": \"Sharp Robinson\"\n" + "      }\n" + "    ],\n"
					+ "    \"greeting\": \"Hello, Winters May! You have 6 unread messages.\",\n"
					+ "    \"favoriteFruit\": \"apple\"\n" + "  }";
		}
		if(kb == 6) {
			return "{\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\",\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\",\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\",\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\",\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\",\"_id\":\"64bfd4c178e6413ce2b2968a\",\"index\":0,\"guid\":\"4e70a56b-9369-4fba-b152-334cbed21f36\",\"isActive\":true,\"balance\":\"$2,346.82\",\"picture\":\"http://placehold.it/32x32\",\"age\":39,\"eyeColor\":\"green\",\"name\":\"Peters Rios\",\"gender\":\"male\",\"company\":\"POSHOME\",\"email\":\"petersrios@poshome.com\",\"phone\":\"+1 (959) 483-2810\",\"address\":\"278 Carroll Street, Gila, Guam, 4838\",\"about\":\"Fugiat ipsum quis sint sit ut enim commodo dolor ad sit dolore quis velit voluptate. Elit magna officia excepteur aute nulla excepteur Lorem ad sint laborum non adipisicing enim minim. Ad magna enim nisi sint elit officia minim esse proident deserunt exercitation incididunt laborum amet. Ad pariatur ad eiusmod voluptate ea ad laboris reprehenderit tempor ex aliqua ea aliquip. Ullamco ad irure ut dolor nisi ea non commodo.\\r\\n\",\"registered\":\"2020-02-02T06:30:57 -06:-30\",\"latitude\":-70.492411,\"longitude\":-117.753201,\"tags\":[\"culpa\",\"labore\",\"labore\",\"eu\",\"enim\",\"laborum\",\"adipisicing\"],\"friends\":[{\"id\":0,\"name\":\"Kristine Donovan\"},{\"id\":1,\"name\":\"Beach Green\"},{\"id\":2,\"name\":\"Jeannine Monroe\"}],\"greeting\":\"Hello, Peters Rios! You have 9 unread messages.\",\"favoriteFruit\":\"banana\"}";
		}
		return null;

	}
}
