# CcWebhookApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCCWebhook**](CcWebhookApi.md#getCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier} | Get a webhook 
[**listCCProjectWebhooks**](CcWebhookApi.md#listCCProjectWebhooks) | **POST** /webhook/v1/project/{project_id}/webhooks | List project&#39;s webhooks 
[**validateCCWebhook**](CcWebhookApi.md#validateCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier}/validate | Validate a webhook 


<a name="getCCWebhook"></a>
# **getCCWebhook**
> CCWebhook getCCWebhook(projectId, webhookIdentifier)

Get a webhook 

Retrieve the details of a webhook sent to you.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CcWebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    CcWebhookApi apiInstance = new CcWebhookApi(defaultClient);
    String projectId = "project_WDQskRIfHQxj53N5mk5K"; // String | The ID of the project. Created and returned when a project is created.
    String webhookIdentifier = "webhook/payment.received/payment_EyfDL6CsvFinpUnXgBXaUuqq3hCXa0"; // String | The ID of the webhook. Created and returned when a webhook is sent.
    try {
      CCWebhook result = apiInstance.getCCWebhook(projectId, webhookIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CcWebhookApi#getCCWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. Created and returned when a project is created. |
 **webhookIdentifier** | **String**| The ID of the webhook. Created and returned when a webhook is sent. |

### Return type

[**CCWebhook**](CCWebhook.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**429** | Rate limited |  -  |

<a name="listCCProjectWebhooks"></a>
# **listCCProjectWebhooks**
> List&lt;CCWebhook&gt; listCCProjectWebhooks(projectId)

List project&#39;s webhooks 

List all webhooks sent to you and their respective responses from your server.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CcWebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    CcWebhookApi apiInstance = new CcWebhookApi(defaultClient);
    String projectId = "project_WDQskRIfHQxj53N5mk5K"; // String | The ID of the project. Created and returned when a project is created.
    try {
      List<CCWebhook> result = apiInstance.listCCProjectWebhooks(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CcWebhookApi#listCCProjectWebhooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. Created and returned when a project is created. |

### Return type

[**List&lt;CCWebhook&gt;**](CCWebhook.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**429** | Rate limited |  -  |

<a name="validateCCWebhook"></a>
# **validateCCWebhook**
> validateCCWebhook(projectId, webhookIdentifier, ccWebhookValidateRequest)

Validate a webhook 

Validate whether a webhook you received was actually sent from us.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CcWebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    CcWebhookApi apiInstance = new CcWebhookApi(defaultClient);
    String projectId = "project_WDQskRIfHQxj53N5mk5K"; // String | The ID of the project. Created and returned when a project is created.
    String webhookIdentifier = "webhook/payment.received/payment_EyfDL6CsvFinpUnXgBXaUuqq3hCXa0"; // String | The ID of the webhook. Created and returned when a webhook is sent.
    CCWebhookValidateRequest ccWebhookValidateRequest = new CCWebhookValidateRequest(); // CCWebhookValidateRequest | 
    try {
      apiInstance.validateCCWebhook(projectId, webhookIdentifier, ccWebhookValidateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CcWebhookApi#validateCCWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. Created and returned when a project is created. |
 **webhookIdentifier** | **String**| The ID of the webhook. Created and returned when a webhook is sent. |
 **ccWebhookValidateRequest** | [**CCWebhookValidateRequest**](CCWebhookValidateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Valid Webhook |  -  |
**400** | Bad request / invalid webhook (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**429** | Rate limited |  -  |

