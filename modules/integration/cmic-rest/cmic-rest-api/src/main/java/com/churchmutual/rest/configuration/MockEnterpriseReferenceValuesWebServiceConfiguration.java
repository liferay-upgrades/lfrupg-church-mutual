package com.churchmutual.rest.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(category = "cmic")
@Meta.OCD(
        id = "com.churchmutual.rest.configuration.MockEnterpriseReferenceValuesWebServiceConfiguration", localization = "content/Language",
        name = "mock-enterprise-reference-values-web-service"
)
public interface MockEnterpriseReferenceValuesWebServiceConfiguration {

    @Meta.AD(
            deflt = "true", description = "Enable mock for Enterprise Reference Values Service method /event-types/v1",
            required = false
    )
    public boolean enableGetEventTypes();

    @Meta.AD(
            deflt = "true", description = "Enable mock for Enterprise Reference Values Service method /companies/v1",
            required = false
    )
    public boolean enableGetCompanies();

    @Meta.AD(
            deflt = "true", description = "Enable mock for Enterprise Reference Values Service method /products/v1",
            required = false
    )
    public boolean enableGetProducts();
}
