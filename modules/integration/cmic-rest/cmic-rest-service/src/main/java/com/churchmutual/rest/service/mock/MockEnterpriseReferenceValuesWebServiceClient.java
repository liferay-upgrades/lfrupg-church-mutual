package com.churchmutual.rest.service.mock;

import com.churchmutual.rest.model.CMICCompanyDTO;
import com.churchmutual.rest.model.CMICEventTypeDTO;
import com.churchmutual.rest.model.CMICProductDTO;
import com.churchmutual.rest.service.MockResponseReaderUtil;
import com.liferay.portal.kernel.json.JSONDeserializer;
import com.liferay.portal.kernel.json.JSONFactory;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import java.util.Arrays;
import java.util.List;

@Component(immediate = true, service = MockEnterpriseReferenceValuesWebServiceClient.class)
public class MockEnterpriseReferenceValuesWebServiceClient {

    public List<CMICCompanyDTO> getCompanies() {
        _log.trace("inside get companies invoke endpoint");
        String fileName = _ENTERPRISE_REFERENCE_VALUES_WEB_SERVICE_DIR + "getCompanies.json";

        String fileContent = MockResponseReaderUtil.readFile(fileName);

        JSONDeserializer<CMICCompanyDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

        CMICCompanyDTO[] results = jsonDeserializer.deserialize(fileContent, CMICCompanyDTO[].class);

        return Arrays.asList(results);
    }

    public List<CMICEventTypeDTO> getEventTypes() {
        _log.trace("inside get eventy types invoke endpoint");
        String fileName = _ENTERPRISE_REFERENCE_VALUES_WEB_SERVICE_DIR + "getEventTypes.json";

        String fileContent = MockResponseReaderUtil.readFile(fileName);

        JSONDeserializer<CMICEventTypeDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

        CMICEventTypeDTO[] results = jsonDeserializer.deserialize(fileContent, CMICEventTypeDTO[].class);

        return Arrays.asList(results);
    }

    public List<CMICProductDTO> getProducts() {
        _log.trace("inside get products invoke endpoint");
        String fileName = _ENTERPRISE_REFERENCE_VALUES_WEB_SERVICE_DIR + "getProducts.json";

        String fileContent = MockResponseReaderUtil.readFile(fileName);

        JSONDeserializer<CMICProductDTO[]> jsonDeserializer = _jsonFactory.createJSONDeserializer();

        CMICProductDTO[] results = jsonDeserializer.deserialize(fileContent, CMICProductDTO[].class);

        return Arrays.asList(results);
    }

    private static final String _ENTERPRISE_REFERENCE_VALUES_WEB_SERVICE_DIR = "enterprise-reference-values-web-service/";

    @Reference
    private JSONFactory _jsonFactory;

    private static final Log _log = LogFactoryUtil.getLog(MockEnterpriseReferenceValuesWebServiceClient.class);
}
