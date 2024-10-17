## Requirements

### Java Version
For the local environment: Java JDK 8

### Node Version
10.15.1


## Bundle Setup

After pulling the local repository:
- Copy the activation key found in `configs/local/deploy` to `bundles/deploy`
- Navigate to the [Project Artifacts](https://drive.google.com/drive/folders/1YdyG64xmXsTGDBJO8u-Hr2tu4SQvals1) Google Drive folder and drop the `lportal.bak` into the `/docker-compose/database-dump` folder
- Ensure that the proper file permissions are set to allow the files within the `docker-compose/database-dump` folder to be copied successfully for use within the database container

In the root directory of your project, run the following command to deploy the themes and modules for this project

```
blade gw clean build deploy
```

### Disable Third Party SSO
To avoid being redirected to the Church Mutual SSO login page, you will need to remove the following configurations found in `[$LIFERAY_HOME]/bundles/osgi/configs`:
* `com.churchmutual.portal.security.sso.openid.connect.internal.configuration.CMICOpenIdConnectProviderConfiguration.config`
* `com.liferay.portal.security.sso.openid.connect.configuration.OpenIdConnectConfiguration.config`
* `com.liferay.portal.security.sso.openid.connect.internal.configuration.OpenIdConnectProviderConfiguration-${UUID}.config`

You will also need to remove the following modules found in `[$LIFERAY_HOME]/bundles/osgi/modules` once the deployment is complete:
* `com.churchmutual.portal.security.sso.openid.connect.impl.fragment.jar`
* `com.churchmutual.portal.security.sso.openid.connect.impl.jar`

## Starting the Environment

Run the following command in the root directory:

```
docker compose up --build -d
```

To view the Docker environment logs, enter the following command:

```
docker compose logs -f liferay
```

After portal setup, be sure to perform a complete reindex.

### Note for Windows OS
If using Windows OS, you will need to adjust the line break types in `entrypoint.sh` and `setup-database.sh` from Windows (CR LF) to Unix (LF). This can be done using Notepad++.
1. Open both files (found in `liferay-files/database`) using Notepad++
2. In the bottom right, you will find where the line break type is specified as `Windows (CR LF)`
3. Right click and choose `Unix (LF)` instead
4. Save the file

Now, you can run the Docker compose commands and start up the environment.


## Access

Navigate to http://localhost:8080/c/portal/login and log in with the provided credentials. Navigate to the Producer and Insured sites for the client portal as the respective user to validate the environment.

- Portal Administrator: `portal.admn@outlook.com` - used for any administrative tasks
- Producer Owner: `producer.owner@outlook.com` - used to validate Producer Site
- Insured Owner: `insured.owner@outlook.com` - used to validate Insured Site


## Mock Services

Under Control Panel --> System Settings --> Church Mutual, there is a list of mock service items that are all enabled by default. These are used in place of the regular service calls to the client's APIs and can be verified by reviewing the functionality of the application. Ensure these are all enabled as the portal administrator before beginning validation.


## Additional Information
A few error logs may be seen during validation but can be ignored for the purposes of validation.
- `javax.ws.rs.ClientErrorException: Unexpected response status 400 with response message: {"error":"Bad Request","message":"Encountered error with status code 400","status":400}`
   - This appears to be related to Analytics Cloud but does not affect functionality on the site
- `ERROR [http-nio-8080-exec-2][CMICPolicyDTO:26] CMICPolicyDTO with policy number=0000015 25-019203 and accountNumber=0000015 has no companyNumber, using default companyNumber`
  - The customer said this is expected for Mock Services