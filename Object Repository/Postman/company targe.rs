<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>company targe</name>
   <tag></tag>
   <elementGuidId>ec6484ee-5027-46dd-a9af-731daf27e3fe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.company-target.com/api/v2/ip.json?key=${key}&amp;page=${page}&amp;referrer=${referrer}&amp;page_title=${page_title}&amp;src=${src}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.key</defaultValue>
      <description></description>
      <id>ca571661-3a06-454a-bb14-b0a86b646d2a</id>
      <masked>false</masked>
      <name>key</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.page</defaultValue>
      <description></description>
      <id>00aa2a83-b907-4a45-87d4-15de44b9e151</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.referrer</defaultValue>
      <description></description>
      <id>b181d119-3b4a-4e8a-8ec7-c3647ccc47ed</id>
      <masked>false</masked>
      <name>referrer</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.page_title</defaultValue>
      <description></description>
      <id>42fc581c-224f-444a-aefa-2489d72678af</id>
      <masked>false</masked>
      <name>page_title</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.src</defaultValue>
      <description></description>
      <id>b67cbcde-c022-4d54-a976-2efdd4094908</id>
      <masked>false</masked>
      <name>src</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.logging.KeywordLogger

def KeywordLogger log = new KeywordLogger()
RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
println(request.restUrl.toString())
log.logInfo(&quot;-------> Request Url= &quot; + request.restUrl.toString())

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
println(response.responseBodyContent.toString())
assert response.getStatusCode() == 200
log.logInfo(&quot;-------> Response Body= &quot; + response.responseBodyContent.toString())
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
