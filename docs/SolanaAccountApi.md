# SolanaAccountApi

All URIs are relative to *https://api.theblockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**solanaGetAccount**](SolanaAccountApi.md#solanaGetAccount) | **GET** /solana/account/{network}/{public_key} | Get the details of an account on Solana
[**solanaGetAccountIsCandyMachine**](SolanaAccountApi.md#solanaGetAccountIsCandyMachine) | **GET** /solana/account/{network}/{public_key}/is_candy_machine | Get if account is candy machine
[**solanaGetAccountIsNFT**](SolanaAccountApi.md#solanaGetAccountIsNFT) | **GET** /solana/account/{network}/{public_key}/is_nft | Get if account is NFT


<a name="solanaGetAccount"></a>
# **solanaGetAccount**
> Account solanaGetAccount(network, publicKey)

Get the details of an account on Solana

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of an account on Solana. Learn more about accounts &lt;a href&#x3D;\&quot;https://docs.solana.com/developing/programming-model/accounts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolanaAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.theblockchainapi.com/v1");
    
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

    SolanaAccountApi apiInstance = new SolanaAccountApi(defaultClient);
    String network = "mainnet-beta"; // String | The network ID (devnet, mainnet-beta)
    String publicKey = "EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w"; // String | The public key of the account
    try {
      Account result = apiInstance.solanaGetAccount(network, publicKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolanaAccountApi#solanaGetAccount");
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
 **network** | **String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **String**| The public key of the account |

### Return type

[**Account**](Account.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Account found. Details in response. |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

<a name="solanaGetAccountIsCandyMachine"></a>
# **solanaGetAccountIsCandyMachine**
> AccountIsCandyMachine solanaGetAccountIsCandyMachine(network, publicKey)

Get if account is candy machine

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-candy-machine\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key address corresponds to a candy machine ID or candy machine configuration.  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolanaAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.theblockchainapi.com/v1");
    
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

    SolanaAccountApi apiInstance = new SolanaAccountApi(defaultClient);
    String network = "mainnet-beta"; // String | The network ID (devnet, mainnet-beta)
    String publicKey = "EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w"; // String | The public key of the account
    try {
      AccountIsCandyMachine result = apiInstance.solanaGetAccountIsCandyMachine(network, publicKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolanaAccountApi#solanaGetAccountIsCandyMachine");
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
 **network** | **String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **String**| The public key of the account |

### Return type

[**AccountIsCandyMachine**](AccountIsCandyMachine.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

<a name="solanaGetAccountIsNFT"></a>
# **solanaGetAccountIsNFT**
> AccountIsNFT solanaGetAccountIsNFT(network, publicKey)

Get if account is NFT

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-account/get-is-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Determine whether or not a public key is an NFT &#x60;mint address&#x60;  &#x60;Cost: 1 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolanaAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.theblockchainapi.com/v1");
    
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

    SolanaAccountApi apiInstance = new SolanaAccountApi(defaultClient);
    String network = "mainnet-beta"; // String | The network ID (devnet, mainnet-beta)
    String publicKey = "EEr5yQpNXf7Bru6Rt5podx56HGW9CEehXqgRGh2wa71w"; // String | The public key of the account
    try {
      AccountIsNFT result = apiInstance.solanaGetAccountIsNFT(network, publicKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolanaAccountApi#solanaGetAccountIsNFT");
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
 **network** | **String**| The network ID (devnet, mainnet-beta) |
 **publicKey** | **String**| The public key of the account |

### Return type

[**AccountIsNFT**](AccountIsNFT.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

