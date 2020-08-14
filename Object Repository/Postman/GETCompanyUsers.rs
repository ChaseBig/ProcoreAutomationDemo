<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GETCompanyUsers</name>
   <tag></tag>
   <elementGuidId>e7d452f3-28bd-455a-956a-61ae07722303</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:78.0) Gecko/20100101 Firefox/78.0</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.5</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-NewRelic-ID</name>
      <type>Main</type>
      <value>UA4DV1dACgoGUlFW</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-CSRF-TOKEN</name>
      <type>Main</type>
      <value>mOJebQrqxAXSfVcZj2TpjSsfU7+Ugo6BBqSnhEisMFFOjI33o0iOAbE8svLZsUaRLPS3znWp10zUQ+YQIkilyA==</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://app.procore.com/10428/company/home/list</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>AWSALB=WF3TVbS6unU43JJvJ15b9Re3F4xzFKU1hjZw5G8onalb9MMUjXCmjLoD1f46e+k3ZhOitlQLgFPPYvrPl3rVd1bhZFVjuvT9tp+qje/7pu4Oy0rlfkLaPkkqBv/W; AWSALBCORS=WF3TVbS6unU43JJvJ15b9Re3F4xzFKU1hjZw5G8onalb9MMUjXCmjLoD1f46e+k3ZhOitlQLgFPPYvrPl3rVd1bhZFVjuvT9tp+qje/7pu4Oy0rlfkLaPkkqBv/W; _session_id=7ed5c3b90d2b053d46852ed0be42a028; _fbp=fb.1.1597348942582.917528623; _ga=GA1.2.1774982454.1597348943; _gid=GA1.2.1579713966.1597348943; global_session_id-production=da6ad94aa34fc874e6589f92ae852edca503f1cd835e68c750299853b0c6ae78--Mzk4MGYwZWEtYzRhMC00OWNjLTkzODYtY2IzZDFjOTFiMzY0; gss_fail_closed_group=true; pc_mkt_app=TRUE; _ga=GA1.1.1774982454.1597348943; _gid=GA1.1.1579713966.1597348943; 11765142_last_login_at=2020-08-13T20%3A47%3A39Z; notice_behavior=none; seen_browser_upgrade_message=yes; liveagent_oref=https://app.procore.com/account/select_company; liveagent_vc=2; liveagent_sid=f07450b8-22fc-456f-8a07-33e6fbef7a71; liveagent_ptid=f07450b8-22fc-456f-8a07-33e6fbef7a71; _gat_procore=1; uvts=e6fcfb27-3255-4b56-6181-49c58188a1ee; _gali=react_company_select</value>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://app.procore.com/vapid/companies/10428/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
