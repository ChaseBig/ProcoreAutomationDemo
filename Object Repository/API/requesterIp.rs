<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>requesterIp</name>
   <tag></tag>
   <elementGuidId>4729358e-a38a-4fb2-a0cc-69dabec852ee</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://{{companyTargetUrl}}/api/v2/ip.json?key={{key}}&amp;page={{page}}&amp;referrer={{referrer}}&amp;page_title={{page_title}}&amp;src={{src}}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'6d6ebed11642fcf1b6e566287e19220f'</defaultValue>
      <description></description>
      <id>3fe4fd19-2d51-48f2-a5e5-1fdfaadb1d10</id>
      <masked>false</masked>
      <name>key</name>
   </variables>
   <variables>
      <defaultValue>'https%3A%2F%2Fwww.procore.com%2Fproject-management'</defaultValue>
      <description></description>
      <id>102f13cd-2f2c-4007-b5a8-492e77d0c9b1</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>'https://www.procore.com/'</defaultValue>
      <description></description>
      <id>6de25554-772f-4617-90b1-e178ac049134</id>
      <masked>false</masked>
      <name>referrer</name>
   </variables>
   <variables>
      <defaultValue>'Construction%20Project%20Management%20Software%20%7C%20Procore'</defaultValue>
      <description></description>
      <id>a0a2be22-6b65-466a-abbb-86b890f9c6b6</id>
      <masked>false</masked>
      <name>page_title</name>
   </variables>
   <variables>
      <defaultValue>'adobelaunch_target'</defaultValue>
      <description></description>
      <id>5d7eabb2-6be9-4e6f-a673-2491e06f9215</id>
      <masked>false</masked>
      <name>src</name>
   </variables>
   <variables>
      <defaultValue>'api.company-target.com'</defaultValue>
      <description></description>
      <id>ebc41dcd-15fb-4c6a-ac90-5d01b8b0d860</id>
      <masked>false</masked>
      <name>companyTargetUrl</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
