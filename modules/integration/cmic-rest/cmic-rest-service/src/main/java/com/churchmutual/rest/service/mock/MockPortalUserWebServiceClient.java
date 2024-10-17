package com.churchmutual.rest.service.mock;

import com.churchmutual.rest.model.CMICInsuredUserDTO;
import com.churchmutual.rest.model.CMICProducerUserDTO;
import com.churchmutual.rest.model.CMICUserDTO;
import com.churchmutual.rest.service.MockResponseReaderUtil;
import com.liferay.portal.kernel.json.JSONDeserializer;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.util.ListUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kayleen Lim
 */
@Component(immediate = true, service = MockPortalUserWebServiceClient.class)
public class MockPortalUserWebServiceClient {

	public CMICUserDTO deleteInsuredEntityUser() {
		return getInsuredUser();
	}

	public CMICUserDTO deleteProducerEntityUser() {
		return getProducerUser();
	}

	public String generateLossRunReport() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "generateLossRunReport.pdf";
		String mockLossRun = MockResponseReaderUtil.readFile(fileName);
		String lossRun = "inline; filename=generateLossRunReport.pdf:" + mockLossRun;
		return lossRun;
	}

	public List<CMICUserDTO> getAccountEntityUsers() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getAccountEntityUsers.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		CMICUserDTO[] cmicUserDTOS = jsonDeserializer.deserialize(fileContent, CMICUserDTO[].class);

		return ListUtil.fromArray(cmicUserDTOS);
	}

	public List<CMICUserDTO> getProducerEntityUsers() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getProducerEntityUsers.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		CMICUserDTO[] cmicUserDTOS = jsonDeserializer.deserialize(fileContent, CMICUserDTO[].class);

		return ListUtil.fromArray(cmicUserDTOS);
	}

	public CMICUserDTO getUserDetails(long cmicUserId) {
		String fileName = "";
		if (cmicUserId == 1086) {
			fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getUserDetails.json";
		} else if (cmicUserId == 1860) {
			fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getUserDetailsMember.json";
		} else if (cmicUserId == 1096) {
			fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getUserDetailsInsuredMember.json";
		}else {
			fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getUserDetailsInsured.json";
		}


		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		return jsonDeserializer.deserialize(fileContent, CMICUserDTO.class);
	}

	public boolean isUserRegistered() {
		return true;
	}

	public CMICInsuredUserDTO provisionExistingInsuredUser() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "provisionExistingInsuredUser.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICInsuredUserDTO> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		return jsonDeserializer.deserialize(fileContent, CMICInsuredUserDTO.class);
	}

	public CMICProducerUserDTO provisionExistingProducerUser() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "provisionExistingProducerUser.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICProducerUserDTO> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		return jsonDeserializer.deserialize(fileContent, CMICProducerUserDTO.class);
	}

	public List<CMICUserDTO> provisionNewInsuredUsers() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "provisionNewInsuredUsers.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		CMICUserDTO[] results = jsonDeserializer.deserialize(fileContent, CMICUserDTO[].class);

		return Arrays.asList(results);
	}

	public List<CMICUserDTO> provisionNewProducerUsers() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "provisionNewProducerUsers.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		CMICUserDTO[] results = jsonDeserializer.deserialize(fileContent, CMICUserDTO[].class);

		return Arrays.asList(results);
	}

	public CMICUserDTO updateInsuredUserRole() {
		return getInsuredUser();
	}

	public CMICUserDTO updateProducerUserRole() {
		return getProducerUser();
	}

	public CMICUserDTO validateInsuredUserRegistration() {
		return getInsuredUser();
	}

	public CMICUserDTO validateProducerUserRegistration() {
		return getProducerUser();
	}

	public CMICUserDTO validateUser(String registrationCode) {
		if (_ERROR.equals(registrationCode)) {
			return null;
		}

		return getProducerUser();
	}

	protected CMICUserDTO getInsuredUser() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getInsuredUser.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		return jsonDeserializer.deserialize(fileContent, CMICUserDTO.class);
	}

	protected CMICUserDTO getProducerUser() {
		String fileName = _PORTAL_USER_WEB_SERVICE_DIR + "getProducerUser.json";

		String fileContent = MockResponseReaderUtil.readFile(fileName);

		JSONDeserializer<CMICUserDTO> jsonDeserializer = _jsonFactory.createJSONDeserializer();

		return jsonDeserializer.deserialize(fileContent, CMICUserDTO.class);
	}

	private static final String _ERROR = "error";

	private static final String _PORTAL_USER_WEB_SERVICE_DIR = "portal-user-web-service/";

	@Reference
	private JSONFactory _jsonFactory;

}